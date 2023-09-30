package pt.up.fe.els2023.FileWriter.OutputFileWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import pt.up.fe.els2023.Table.Table;

public class HtmlFileWriter implements OutputFileWriter {

    private final Table table;
    private final String outputFilePath;

    public HtmlFileWriter(Table table, String outputFilePath) {
        this.table = table;
        this.outputFilePath = outputFilePath;
    }

    @Override
    public void writeFile() {
        FileOutputStream outputStream = null;
        List<String> headers = table.getHeaders();
        List<List<Object>> rows = table.getRows();

        try {
            outputStream = new FileOutputStream(outputFilePath);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        ObjectOutputStream objectOutput = null;
        try {
            objectOutput = new ObjectOutputStream(outputStream);
            objectOutput.writeObject(headers);
            objectOutput.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
