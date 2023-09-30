package pt.up.fe.els2023.FileWriter.OutputFileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import pt.up.fe.els2023.Table.Table;
import pt.up.fe.specs.util.csv.CsvWriter;

public class CsvFileWriter implements OutputFileWriter {

    private final Table table;
    private final String outputFilePath;

    public CsvFileWriter(Table table, String outputFilePath) {
        this.table = table;
        this.outputFilePath = outputFilePath;
    }

    @Override
    public void writeFile() {
        List<String> headers = table.getHeaders();
        List<List<Object>> rows = table.getRows();

        // create csv writer instance with default separator and header lines
        CsvWriter csvWriter = new CsvWriter(headers);

        // add row lines
        for (List<Object> row: rows) {
            csvWriter.addLineToString(row);
        }

        // generate csv content
        String csvContent = csvWriter.buildCsv();
        File outputFile = new File(outputFilePath);

        try {
            // create path directories if non-existent
            outputFile.getParentFile().mkdirs();

            // create csv file and write its content
            FileWriter fileWriter = new FileWriter(outputFile);
            fileWriter.write(csvContent);
            fileWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}