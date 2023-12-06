package pt.up.fe.els2023;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParser;
import com.google.inject.Inject;
import org.feup.els5.dsl.TableDSLStandaloneSetup;
import org.feup.els5.dsl.tableDSL.*;
import pt.up.fe.els2023.Command.Extract.ExtractSelectors;
import pt.up.fe.els2023.CustomExceptions.SyntaxException;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract.DSLExtractByKey;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract.DSLExtractTopN;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;
import pt.up.fe.els2023.InternalDSL.DSLTableExecutor;
import pt.up.fe.specs.util.classmap.FunctionClassMap;
import pt.up.fe.specs.util.exceptions.NotImplementedException;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.StreamSupport;

public class Parser {
    private final DSLTableBuilder dslTableBuilder;
    @Inject
    private IParser parser;
    private final FunctionClassMap<Operation, Void> operationMap;

    public Parser() {
        dslTableBuilder = new DSLTableBuilder();
        operationMap = new FunctionClassMap<>();
        buildOperationFunctionClassMap();
        var injector = new TableDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        injector.injectMembers(this);
    }

    private void buildOperationFunctionClassMap() {
        operationMap.put(Filter.class, filter -> {
            visitFilter(filter);
            return null;
        });

        operationMap.put(Select.class, select -> {
            visitSelect(select);
            return null;
        });

        operationMap.put(RenameColumn.class, renameColumn -> {
            visitRenameColumn(renameColumn);
            return null;
        });

        operationMap.put(Extract.class, extract -> {
            visitExtract(extract);
            return null;
        });
    }

    private void parseLine(EObject node) throws NotImplementedException {
        if (node instanceof TableInputPath tableInputPath) {
            parseInputPath(tableInputPath);
        }
        else if (node instanceof Operation operation) {
            parseOperation(operation);
        } else if (node instanceof Output output) {
            parseOutputPath(output);
        }
        else {
            throw new NotImplementedException("Node type not implemented: " + node.getClass().getSimpleName());
        }
    }

    private void parseInputPath(TableInputPath inputPath) {
        for (String pathPattern : inputPath.getPathPatterns()) {
            dslTableBuilder.source().fileSystemSource().path(pathPattern).end();
        }
    }

    private void visitFilter(Filter filter) {
        for (FilterRule filterRule : filter.getDenylist().getDenylist()) {
            if (filterRule instanceof FilterColumnRule filterColumnRule) {
                dslTableBuilder.operation().filter().blacklist().column(parseFilterColumnRule(filterColumnRule).toArray(new String[0])).end();
            } else if (filterRule instanceof FilterObjectTypeRule filterObjectTypeRule) {
                dslTableBuilder.operation().filter().blacklist().objectOfType(parseFilterTypeRule(filterObjectTypeRule).toArray(new Class[0])).end();
            } else {
                throw new NotImplementedException("Filter rule type not implemented: " + filterRule.getClass().getSimpleName());
            }
        }
        for (FilterRule filterRule : filter.getExceptlist().getExceptlist()) {
            if (filterRule instanceof FilterColumnRule filterColumnRule) {
                dslTableBuilder.operation().filter().whitelist().column(parseFilterColumnRule(filterColumnRule).toArray(new String[0])).end();
            } else if (filterRule instanceof FilterObjectTypeRule filterObjectTypeRule) {
                dslTableBuilder.operation().filter().whitelist().objectOfType(parseFilterTypeRule(filterObjectTypeRule).toArray(new Class[0])).end();
            } else {
                throw new NotImplementedException("Filter rule type not implemented: " + filterRule.getClass().getSimpleName());
            }
        }
    }

    private void visitSelect(Select select) {
        dslTableBuilder.operation().select().column(select.getColumnPatterns().stream().map(ColumnName::getColumnName).toList().toArray(new String[0])).end();
    }

    private void visitRenameColumn(RenameColumn renameColumn) {
        for (RenameColumnPair renameColumnPair : renameColumn.getRenameTuples()) {
            if (renameColumnPair instanceof RenameColumnToPair renameColumnToPair) {
                dslTableBuilder.operation().renameColumn().from(renameColumnToPair.getOldName()).to(renameColumnToPair.getNewName()).end();
            } else {
                throw new NotImplementedException("Rename column pair type not implemented: " + renameColumnPair.getClass().getSimpleName());
            }
        }
    }

    private void visitExtract(Extract extract) {
        Map<String, String> targetColumnMap = new HashMap<>();

        for (ExtractColumnMapping extractColumnMapping : extract.getTargets()) {
            String value = extractColumnMapping.getNewName() == null ? extractColumnMapping.getTargetColumn() : extractColumnMapping.getNewName();

            targetColumnMap.put(extractColumnMapping.getTargetColumn(), value);
        }

        List<String> comparisonKeys = new ArrayList<>();

        for (ColumnName columnName : extract.getComparator().getKeys()) {
            comparisonKeys.add(columnName.getColumnName());
        }

        if (extract.getSelector() instanceof KeySelector keySelector) {
            dslTableBuilder.operation().extract().byKey().get(targetColumnMap).from(extract.getSourceColumn()).sortBy(comparisonKeys).extract(ExtractSelectors.valueOf(keySelector.getKey()));
        } else if (extract.getSelector() instanceof TopNSelector topNSelector) {
            dslTableBuilder.operation().extract().top().get(targetColumnMap).from(extract.getSourceColumn()).sortBy(comparisonKeys).extract(topNSelector.getN());
        }
    }

    private void parseOperation(Operation operation) {
        operationMap.apply(operation);
    }

    private List<String> parseFilterColumnRule(FilterColumnRule filterColumnRule) {
        return filterColumnRule.getColumnPatterns().stream().map(
                pattern -> pattern.getColumnName().equals("FILENAME") ? "0__filename"
                        : pattern.getColumnName().equals("DIRECTORY") ? "0__folder" : pattern.getColumnName()).toList();
    }

    private List<? extends Class<?>> parseFilterTypeRule(FilterObjectTypeRule filterObjectTypeRule) {
        return filterObjectTypeRule.getObjectClasses().stream().map(className -> {
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException e) {
                return null;
            }
        }).toList();
    }

    private void parseOutputPath(Output output) {
        for (String outputPath : output.getOutputPaths()) {
            dslTableBuilder.outputTo(outputPath);
        }
    }

    public DSLTableExecutor parse(String code) throws SyntaxException {
        var result = parser.parse(new StringReader(code));

        if (result.hasSyntaxErrors()) {
            throw new SyntaxException(StreamSupport.stream(result.getSyntaxErrors().spliterator(), false).map(error -> error.getSyntaxErrorMessage().getMessage()).toList());
        }

        Start start = (Start) result.getRootASTElement();

        for (EObject action : start.getActions()) {
            try {
                parseLine(action);
            } catch (NotImplementedException e) {
                System.out.println(action);
            }
        }

        return dslTableBuilder.end();
    }
}