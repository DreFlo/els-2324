package pt.up.fe.els2023.Controller;

import pt.up.fe.els2023.Config.Source.FileSource;
import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.FileParser.ConfigFileParser.ConfigFileParser;
import pt.up.fe.els2023.FileParser.ConfigFileParser.JSONConfigFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.YamlFileParser;
import pt.up.fe.els2023.FileWriter.OutputFileWriter.CsvFileWriter;
import pt.up.fe.els2023.FileWriter.OutputFileWriter.HtmlFileWriter;
import pt.up.fe.els2023.Utils;
import pt.up.fe.els2023.Table.Table;
import pt.up.fe.els2023.TableBuilder.TableBuilder;
import pt.up.fe.els2023.TableManipulator.TableManipulator;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Controller {
    File configFile;
    ConfigFileParser<?> configFileParser;
    HashSet<Table> tables;

    public Controller (File configFile){
        this.configFile = configFile;
        this.tables = new HashSet<>();
    }

    public void setup() {
        String extension = Utils.getExtensionFromFile(configFile);

        switch (extension) {
            case "json":
                configFileParser = new JSONConfigFileParser(configFile);
                break;
            default:
                System.out.println("Error: " + extension + " file type not configured.");
                break;
        }

    }

    public void run() {

        // Config File Parser
        configFileParser.parse();
        List<TableConfig> tableConfigs = configFileParser.getConfigurationFiles();

        // Input File Parser
        for (TableConfig tableConfig: tableConfigs) {
            List<InputFileParser> inputFileParserList = new ArrayList<>();
            for (Source source: tableConfig.getSources()){
                File file = new File(((FileSource) source).getPathPattern());
                String extension = Utils.getExtensionFromFile(file);

                switch (extension) {
                    case "yaml":
                        inputFileParserList.add(new YamlFileParser(file));
                        break;
                    default:
                        System.out.println("Error: " + extension + " file type not configured.");
                        break;
                }
            }
            for (InputFileParser inputFileParser: inputFileParserList) {
                inputFileParser.parse();
            }
            TableBuilder tableBuilder = new TableBuilder(tableConfig.getTableName(), inputFileParserList);

            Table table = tableBuilder.build();

            TableManipulator tableManipulator = new TableManipulator(tableConfigs.get(0).getOperations());

            tables.add(tableManipulator.applyOperations(table));

            for (Table currentTable : tables) {
                // config outputs for each table
                for (String output: tableConfig.getOutputs()) {
                    String extension = Utils.getExtensionFromPath(output);

                    switch (extension) {
                        case "csv":
                            CsvFileWriter csvFileWriter = new CsvFileWriter(currentTable, output);
                            csvFileWriter.writeFile();
                            break;
                        case "html":
                            HtmlFileWriter htmlFileWriter = new HtmlFileWriter(currentTable, output);
                            htmlFileWriter.writeFile();
                            break;
                        default:
                            System.out.println("Error: " + extension + " file type not configured.");
                            break;
                    }
                }
            }

        }
    }
}
