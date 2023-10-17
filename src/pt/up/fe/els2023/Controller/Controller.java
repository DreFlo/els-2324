package pt.up.fe.els2023.Controller;

import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.FileMatcher;
import pt.up.fe.els2023.FileParser.ConfigFileParser.ConfigFileParser;
import pt.up.fe.els2023.FileParser.ConfigFileParser.JSONConfigFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.JSONFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.YamlFileParser;
import pt.up.fe.els2023.FileWriter.OutputFileWriter.CsvFileWriter;
import pt.up.fe.els2023.FileWriter.OutputFileWriter.HtmlFileWriter;
import pt.up.fe.els2023.Utils;
import pt.up.fe.els2023.Table.Table;
import pt.up.fe.els2023.TableBuilder.TableBuilder;
import pt.up.fe.els2023.TableManipulator.TableManipulator;

import java.io.File;
import java.util.*;


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


    private void addFileParser(List<InputFileParser> inputFileParserList, File file, boolean storeFolderName) {
        String extension = Utils.getExtensionFromFile(file);

        switch (extension) {
            case "yaml":
                inputFileParserList.add(new YamlFileParser(file, storeFolderName));
                break;
            case "json":
                inputFileParserList.add(new JSONFileParser(file, storeFolderName));
                break;
            default:
                System.out.println("Error: " + extension + " file type not configured.");
                break;
        }
    }




    public void run() {

        System.out.println("Parsing config file");

        // Config File Parser
        configFileParser.parse();
        List<TableConfig> tableConfigs = configFileParser.getTableConfigs();

        System.out.println("Parsed config file");

        // Input File Parser
        for (TableConfig tableConfig: tableConfigs) {
            System.out.println("Working on table: \"" + tableConfig.getTableName() + "\"");

            List<InputFileParser> inputFileParserList = new ArrayList<>();

            for (Source source: tableConfig.getSources()){
                for(File matchedFile: Objects.requireNonNull(FileMatcher.matchedFiles(source))){
                    addFileParser(inputFileParserList, matchedFile, false);
                }
            }

            for (InputFileParser inputFileParser: inputFileParserList) {
                inputFileParser.parse();
            }

            System.out.println("Parsed input files");

            TableBuilder tableBuilder = new TableBuilder(tableConfig.getTableName(), inputFileParserList);

            Table table = tableBuilder.build();

            TableManipulator tableManipulator = new TableManipulator(tableConfig.getOperations());

            System.out.println("Applying operations");

            table = tableManipulator.applyOperations(table);

            tables.add(table);

            if (!tableConfig.getOutputs().isEmpty()) {
                System.out.println("Writing outputs");
            }

            for (String output: tableConfig.getOutputs()) {
                System.out.println("Writing: \"" + output + "\"");

                String extension = Utils.getExtensionFromPath(output);

                switch (extension) {
                    case "csv":
                        CsvFileWriter csvFileWriter = new CsvFileWriter(table, output);
                        csvFileWriter.writeFile();
                        break;
                    case "html":
                        HtmlFileWriter htmlFileWriter = new HtmlFileWriter(table, output);
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
