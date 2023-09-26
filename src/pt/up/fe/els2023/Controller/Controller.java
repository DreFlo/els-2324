package pt.up.fe.els2023.Controller;

import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.FileParser.ConfigFileParser.ConfigFileParser;
import pt.up.fe.els2023.FileParser.ConfigFileParser.JSONConfigFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.YamlFileParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    File configFile;
    ConfigFileParser configFileParser;
    List<InputFileParser> inputFileParserList;

    public Controller (File configFile){
        this.configFile = configFile;
    }

    public void setup() {
        // TODO: Fazer nisto noutra class, maybe
        String extension = "";
        String filePath = configFile.getPath();

        int index = filePath.lastIndexOf('.');
        if (index > 0) {
            extension = filePath.substring(index + 1);
        }

        switch (extension) {
            case "json":
                configFileParser = new JSONConfigFileParser();
                break;
            case "yaml":
                break;
            default:
                System.out.println("Error: " + extension + " typefile not configurated.");
        }

    }

    public void run() {

        // Config File Parser
        configFileParser.parse(configFile);
        List<TableConfig> tableConfigs = configFileParser.getConfigurationFiles();
        System.out.println(tableConfigs.get(0));

        // Input File Parser

        InputFileParser inputFileParser = new YamlFileParser();
        inputFileParser.parse(new File("resources/decision_tree_1.yaml"));
        List<String> file = new ArrayList<>();
        file.add("params/criterion");
        file.add("params/splitter");
        System.out.println(inputFileParser.getRow(file));

        // Operations -> Commands


        // Output -> Ultima coisa
    }
}
