package pt.up.fe.els2023.Controller;

import pt.up.fe.els2023.Config.Source.FileSystemSource;
import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.FileMatcher;
import pt.up.fe.els2023.InputFileParser.InputFileParser;
import pt.up.fe.els2023.InputFileParser.JSONFileParser;
import pt.up.fe.els2023.InputFileParser.XMLFileParser;
import pt.up.fe.els2023.InputFileParser.YamlFileParser;
import pt.up.fe.els2023.FileWriter.OutputFileWriter.CsvFileWriter;
import pt.up.fe.els2023.FileWriter.OutputFileWriter.HtmlFileWriter;
import pt.up.fe.els2023.Utils.TableUtils;
import pt.up.fe.els2023.Table.Table;
import pt.up.fe.els2023.TableBuilder.TableBuilder;
import pt.up.fe.els2023.TableManipulator.TableManipulator;
import pt.up.fe.els2023.CustomExceptions.FileTypeNotConfiguredException;

import java.io.File;
import java.util.*;


public class Controller {
    HashSet<Table> tables;

    List<TableConfig> tableConfigs;

    public Controller (List<TableConfig> tableConfigs){
        this.tableConfigs = tableConfigs;
        this.tables = new HashSet<>();
    }

    private void addFileParser(List<InputFileParser> inputFileParserList, File file) throws FileTypeNotConfiguredException {
        String extension = TableUtils.getExtensionFromFile(file);

        switch (extension) {
            case "yaml":
                inputFileParserList.add(new YamlFileParser(file));
                break;
            case "json":
                inputFileParserList.add(new JSONFileParser(file));
                break;
            case "xml":
                inputFileParserList.add(new XMLFileParser(file));
                break;
            default:
                throw new FileTypeNotConfiguredException(extension);
        }
    }

    public void run() throws Exception {
        // Input File Parser
        for (TableConfig tableConfig: tableConfigs) {
            System.out.println("Working on table");

            List<InputFileParser> inputFileParserList = new ArrayList<>();

            for (Source source: tableConfig.getSources()){
                if (source instanceof FileSystemSource fileSystemSource) {
                    for (File matchedFile : Objects.requireNonNull(FileMatcher.matchedFiles(fileSystemSource))) {
                        addFileParser(inputFileParserList, matchedFile);
                    }
                }
            }

            for (InputFileParser inputFileParser: inputFileParserList) {
                inputFileParser.parse();
            }

            System.out.println("Parsed input files");

            TableBuilder tableBuilder = new TableBuilder(inputFileParserList);

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

                String extension = TableUtils.getExtensionFromPath(output);

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
                        throw new FileTypeNotConfiguredException(extension);
                }
            }
        }
    }
}
