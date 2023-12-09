package pt.up.fe.els2023;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParser;
import com.google.inject.Inject;
import org.feup.els5.dsl.TableDSLStandaloneSetup;
import org.feup.els5.dsl.tableDSL.*;
import pt.up.fe.els2023.Command.Extract.ExtractSelectors;
import pt.up.fe.els2023.CustomExceptions.SyntaxException;
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

        operationMap.put(SquashRows.class, squashRows -> {
            visitSquashRows(squashRows);
            return null;
        });

        operationMap.put(Reduce.class, reduce -> {
            visitReduce(reduce);
            return null;
        });
    }

    private void visitSquashRows(SquashRows squashRows) {
        List<String> columnRules = squashRows.getColumns().stream().map(ColumnName::getColumnName).toList();
        dslTableBuilder.operation().squashBy().column(getColumnNames(columnRules).toArray(new String[0])).end();
    }

    private void visitNode(EObject node) {
        if (node instanceof TableInputPath tableInputPath) {
            visitTableInputPath(tableInputPath);
        } else if (node instanceof Operation operation) {
            visitOperation(operation);
        } else if (node instanceof Output output) {
            visitOutput(output);
        } else {
            throw new NotImplementedException("Node type not implemented: " + node.getClass().getSimpleName());
        }
    }

    private void visitTableInputPath(TableInputPath inputPath) {
        for (String pathPattern : inputPath.getPathPatterns()) {
            dslTableBuilder.source().fileSystemSource().path(pathPattern).end();
        }
    }

    private void visitFilter(Filter filter) {
        for (FilterRule filterRule : filter.getDenylist().getDenylist()) {
            if (filterRule instanceof FilterColumnRule filterColumnRule) {
                List<String> columnRules = filterColumnRule.getColumnPatterns().stream().map(ColumnName::getColumnName).toList();
                dslTableBuilder.operation().filter().denylist().column(getColumnNames(columnRules).toArray(new String[0])).end();
            } else if (filterRule instanceof FilterObjectTypeRule filterObjectTypeRule) {
                dslTableBuilder.operation().filter().denylist().objectOfType(getClasses(filterObjectTypeRule).toArray(new Class[0])).end();
            } else {
                throw new NotImplementedException("Filter rule type not implemented: " + filterRule.getClass().getSimpleName());
            }
        }
        for (FilterRule filterRule : filter.getExceptlist().getExceptlist()) {
            if (filterRule instanceof FilterColumnRule filterColumnRule) {
                List<String> columnRules = filterColumnRule.getColumnPatterns().stream().map(ColumnName::getColumnName).toList();
                dslTableBuilder.operation().filter().exceptlist().column(getColumnNames(columnRules).toArray(new String[0])).end();
            } else if (filterRule instanceof FilterObjectTypeRule filterObjectTypeRule) {
                dslTableBuilder.operation().filter().exceptlist().objectOfType(getClasses(filterObjectTypeRule).toArray(new Class[0])).end();
            } else {
                throw new NotImplementedException("Filter rule type not implemented: " + filterRule.getClass().getSimpleName());
            }
        }
    }

    private void visitSelect(Select select) {
        List<String> columnRules = select.getColumnPatterns().stream().map(ColumnName::getColumnName).toList();
        dslTableBuilder.operation().select().column(getColumnNames(columnRules).toArray(new String[0])).end();
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
            dslTableBuilder.operation().extract().byKey().get(targetColumnMap).from(extract.getSourceColumn()).sortBy(comparisonKeys).extract(ExtractSelectors.valueOf(keySelector.getKey())).end();
        } else if (extract.getSelector() instanceof TopNSelector topNSelector) {
            dslTableBuilder.operation().extract().top().get(targetColumnMap).from(extract.getSourceColumn()).sortBy(comparisonKeys).extract(topNSelector.getN()).end();
        }
    }

    private void visitReduce(Reduce reduce) {
        throw new NotImplementedException("Reduce not implemented");
    }

    private void visitOperation(Operation operation) {
        operationMap.apply(operation);
    }

    private List<String> getColumnNames(List<String> columnRules) {
        return columnRules.stream().map(
                pattern -> pattern.equals("FILENAME") ? "0__filename"
                        : pattern.equals("DIRECTORY") ? "0__folder" : pattern).toList();
    }

    private Class<?> getClass(ObjectTypeSelector objectTypeSelector) {
        return switch (objectTypeSelector.getObjectType()) {
            case "STRING" -> String.class;
            case "INTEGER" -> Integer.class;
            case "DOUBLE" -> Double.class;
            case "NUMBER" -> Number.class;
            case "BOOLEAN" -> Boolean.class;
            case "FLOAT" -> Float.class;
            default -> {
                try {
                    yield Class.forName(objectTypeSelector.getObjectType());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    private List<? extends Class<?>> getClasses(FilterObjectTypeRule filterObjectTypeRule) {
        return filterObjectTypeRule.getObjectClasses().stream().map(this::getClass).toList();
    }

    private void visitOutput(Output output) {
        for (String outputPath : output.getOutputPaths()) {
            dslTableBuilder.outputTo(outputPath);
        }
    }

    public DSLTableExecutor parse(String code) throws SyntaxException {
        var result = parser.parse(new StringReader(code));

        if (result.hasSyntaxErrors()) {
            throw new SyntaxException(StreamSupport.stream(result.getSyntaxErrors().spliterator(), false)
                    .map(error -> error.getSyntaxErrorMessage().getMessage()).toList());
        }

        Start start = (Start) result.getRootASTElement();

        for (EObject action : start.getActions()) {
            try {
                visitNode(action);
            } catch (NotImplementedException e) {
                System.out.println(action);
            }
        }

        return dslTableBuilder.end();
    }
}