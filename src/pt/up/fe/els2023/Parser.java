package pt.up.fe.els2023;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParser;
import com.google.inject.Inject;
import org.feup.els5.dsl.TableDSLStandaloneSetup;
import org.feup.els5.dsl.tableDSL.*;
import pt.up.fe.els2023.CustomExceptions.SyntaxException;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;
import pt.up.fe.els2023.InternalDSL.DSLTableExecutor;
import pt.up.fe.specs.util.exceptions.NotImplementedException;

import java.io.StringReader;
import java.util.List;
import java.util.stream.StreamSupport;

public class Parser {
    final DSLTableBuilder dslTableBuilder;
    @Inject
    private IParser parser;

    public Parser() {
        dslTableBuilder = new DSLTableBuilder();
        var injector = new TableDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        injector.injectMembers(this);
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

    private void parseOperation(Operation operation) throws NotImplementedException {
        if (operation instanceof Filter filter) {
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
        } else if (operation instanceof Select select) {
            dslTableBuilder.operation().select().column(select.getColumnPatterns().stream().map(ColumnName::getColumnName).toList().toArray(new String[0])).end();
        } else if (operation instanceof RenameColumn renameColumn) {
            for (RenameColumnPair renameColumnPair : renameColumn.getRenameTuples()) {
                if (renameColumnPair instanceof RenameColumnToPair renameColumnToPair) {
                    dslTableBuilder.operation().renameColumn().from(renameColumnToPair.getOldName()).to(renameColumnToPair.getNewName()).end();
                } else {
                    throw new NotImplementedException("Rename column pair type not implemented: " + renameColumnPair.getClass().getSimpleName());
                }
            }
        } else {
            throw new NotImplementedException("Operation type not implemented: " + operation.getClass().getSimpleName());
        }
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