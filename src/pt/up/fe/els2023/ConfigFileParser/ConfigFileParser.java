package pt.up.fe.els2023.ConfigFileParser;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.Utils.FileParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class ConfigFileParser<ParserObject> implements FileParser {
    ParserObject parserObject = null;
    File inputFile;

    public ConfigFileParser(File inputFile) {
        this.inputFile = inputFile;
    }

    public final List<TableConfig> getTableConfigs() throws RuntimeException {
        if (parserObject == null) {
            throw new RuntimeException("No Configuration was parsed");
        }

        if (!hasTables(parserObject)) {
            throw new RuntimeException("Configuration missing \"tables\"");
        }

        List<ParserObject> tables = retrieveConfigurationTableList(parserObject);

        List<TableConfig> tableConfigs = new ArrayList<>();

        for (ParserObject tableConfigObject : tables) {
            tableConfigs.add(getTableConfig(tableConfigObject));
        }

        return tableConfigs;
    }

    private TableConfig getTableConfig(ParserObject parserObject) throws RuntimeException {
        String name;
        List<Source> sources = new ArrayList<>();
        List<Command> operations = new ArrayList<>();
        List<String> outputs = new ArrayList<>();

        if (!hasTableName(parserObject)) {
            throw new RuntimeException("Configuration missing \"name\"");
        }

        name = extractTableName(parserObject);

        if (!hasSources(parserObject)) {
            throw new RuntimeException("Configuration missing \"sources\"");
        }

        extractSources(sources, parserObject);

        if (!hasOperations(parserObject)) {
            throw new RuntimeException("Configuration missing \"operations\"");
        }

        extractCommands(operations, parserObject);

        if (!hasOutputs(parserObject)) {
            throw new RuntimeException("Configuration missing \"outputs\"");
        }

        extractOutputs(outputs, parserObject);

        return new TableConfig(name, sources, operations, outputs);
    };

    protected abstract List<ParserObject> retrieveConfigurationTableList(ParserObject parserObject);

    protected abstract String extractTableName(ParserObject parserObject);

    protected abstract void extractSources(List<Source> sources, ParserObject parserObject);

    protected abstract void extractCommands(List<Command> operations, ParserObject parserObject);

    protected abstract void extractOutputs(List<String> outputs, ParserObject parserObject);

    protected abstract boolean hasTables(ParserObject parserObject);

    protected abstract boolean hasTableName(ParserObject parserObject);

    protected abstract boolean hasSources(ParserObject parserObject);

    protected abstract boolean hasOperations(ParserObject parserObject);

    protected abstract boolean hasOutputs(ParserObject parserObject);

}
