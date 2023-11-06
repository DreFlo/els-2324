package pt.up.fe.els2023;

import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.ConfigFileParser.ConfigFileParser;
import pt.up.fe.els2023.ConfigFileParser.JSONConfigFileParser;
import pt.up.fe.els2023.InternalDSL.InternalDSL;
import pt.up.fe.els2023.Utils.Comparators;
import pt.up.fe.els2023.Utils.Selectors;
import pt.up.fe.els2023.Utils.TableUtils;

import java.io.File;
import java.util.List;


public class Main {
    File configFile;
    ConfigFileParser<?> configFileParser;

    public List<TableConfig> parseConfigFile() {
        // Config File Parser
        configFileParser.parse();
        return configFileParser.getTableConfigs();
    }

    public void setup() {
        String extension = TableUtils.getExtensionFromFile(configFile);

        switch (extension) {
            case "json":
                configFileParser = new JSONConfigFileParser(configFile);
                break;
            default:
                System.out.println("Error: " + extension + " file type not configured.");
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        InternalDSL internalDSL = new InternalDSL();

        internalDSL
            .table()
                .name("tableName")
                .source()
                    .folder()
                        .path("resources/run2")
                        .end()
                .operation()
                    .squashRows()
                        .end()
                .operation()
                    .extract()
                        .from("functions")
                        .select(Selectors.MAX)
                        .sortBy(Comparators.TIME_PERCENTAGE)
                        .get("name")
                        .end()
                .operation()
                    .filter()
                        .blacklist()
                            .column(".*\\/.*")
                            .objectOfType(List.class)
                            .end()
                        .whitelist()
                            .column("^params\\/.*")
                            .column(".*AreaEstimates/Resources/.*")
                            .column("^functions\\/.*")
                            .end()
                        .end()
                .outputTo("output/DSL3.csv");
    }
}