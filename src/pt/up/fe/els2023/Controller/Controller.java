package pt.up.fe.els2023.Controller;

import pt.up.fe.els2023.Config.Source.FileSource;
import pt.up.fe.els2023.Config.Source.Source;
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
        inputFileParserList = new ArrayList<>();
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
        System.out.println(tableConfigs.get(0));

        // Input File Parser

        for (TableConfig tableConfig: tableConfigs) {
            for (Source source: tableConfig.getSources()){
                // TODO: Codigo Repetido -> Fazer isto em util.java
                String extension = "";
                String filePath = ((FileSource)  source).getPathPattern();

                int index = filePath.lastIndexOf('.');
                if (index > 0) {
                    extension = filePath.substring(index + 1);
                }

                switch (extension) {
                    case "yaml":
                        inputFileParserList.add(new YamlFileParser(new File(filePath)));
                        break;
                    default:
                        System.out.println("Error: " + extension + " typefile not configurated.");
                        break;
                }
            }
        }


        // Operations -> Commands


        // Output -> Ultima coisa
    }
}
