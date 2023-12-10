package pt.up.fe.els2023;

import pt.up.fe.els2023.Command.Extract.ExtractSelectors;
import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.ConfigFileParser.ConfigFileParser;
import pt.up.fe.els2023.ConfigFileParser.JSONConfigFileParser;
import pt.up.fe.els2023.CustomExceptions.FileTypeNotConfiguredException;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;
import pt.up.fe.els2023.InternalDSL.DSLTableExecutor;
import pt.up.fe.els2023.Utils.TableUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Main {
    File configFile;
    ConfigFileParser<?> configFileParser;

    public List<TableConfig> parseConfigFile() {
        // Config File Parser
        configFileParser.parse();
        return configFileParser.getTableConfigs();
    }

    public void setup() throws FileTypeNotConfiguredException {
        String extension = TableUtils.getExtensionFromFile(configFile);

        switch (extension) {
            case "json":
                configFileParser = new JSONConfigFileParser(configFile);
                break;
            default:
                throw new FileTypeNotConfiguredException(extension);
        }
    }

    public static void main(String[] args) throws Exception {
        Parser parser = new Parser();

        DSLTableExecutor dslTableExecutor = parser.parse(Files.readString(Path.of(args[0])));

        dslTableExecutor.execute();
    }
}