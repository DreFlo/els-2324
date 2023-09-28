package pt.up.fe.els2023.Controller;

import pt.up.fe.els2023.Config.Source.FileSource;
import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.FileParser.ConfigFileParser.ConfigFileParser;
import pt.up.fe.els2023.FileParser.ConfigFileParser.JSONConfigFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.YamlFileParser;
import pt.up.fe.els2023.MyUtils;
import pt.up.fe.els2023.Table.Table;
import pt.up.fe.els2023.TableBuilder.TableBuilder;
import pt.up.fe.els2023.TableManipulator.TableManipulator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    File configFile;
    ConfigFileParser configFileParser;
    List<InputFileParser> inputFileParserList;

    public Controller (File configFile){
        this.configFile = configFile;
        inputFileParserList = new ArrayList<>();
    }

    public void setup() {
        String extension = MyUtils.getExtensionFromFile(configFile);

        switch (extension) {
            case "json":
                configFileParser = new JSONConfigFileParser(configFile);
                break;
            default:
                System.out.println("Error: " + extension + " typefile not configurated.");
                break;
        }

    }

    public void run() {

        // Config File Parser
        configFileParser.parse();
        List<TableConfig> tableConfigs = configFileParser.getConfigurationFiles();

        // Input File Parser

        for (TableConfig tableConfig: tableConfigs) {
            for (Source source: tableConfig.getSources()){
                File file = new File(((FileSource) source).getPathPattern());
                String extension = MyUtils.getExtensionFromFile(file);

                switch (extension) {
                    case "yaml":
                        inputFileParserList.add(new YamlFileParser(file));
                        break;
                    default:
                        System.out.println("Error: " + extension + " typefile not configurated.");
                        break;
                }
            }
        }

        for (InputFileParser inputFileParser: inputFileParserList) {
            inputFileParser.parse();
        }


        TableBuilder tableBuilder = new TableBuilder(inputFileParserList);
        Table table = tableBuilder.build();
        System.out.println(table);

        // Table Operations
        TableManipulator tableManipulator = new TableManipulator(tableConfigs.get(0).getOperations());

        Table newTable = tableManipulator.applyOperations(table);

        System.out.println(newTable);

        // Output -> Ultima coisa


    }
}
