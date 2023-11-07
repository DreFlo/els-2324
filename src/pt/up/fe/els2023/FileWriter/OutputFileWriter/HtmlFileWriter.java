package pt.up.fe.els2023.FileWriter.OutputFileWriter;

import java.io.*;
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

        List<String> headers = table.getHeaders();
        List<List<Object>> rows = table.getRows();

        StringBuilder htmlString = new StringBuilder();

        // start html table string
        htmlString.append("<html><body><table>");

        // headers
        htmlString.append("<tr>");
        for (String header : headers) {
            htmlString.append("<th>").append(header).append("</th>");
        }
        htmlString.append("</tr>");

        System.out.println(rows);

        // rows
        for (List<Object> row : rows) {
            htmlString.append("<tr>");
            System.out.println(row);
            for (Object rowData : row) {
                if (rowData == null) {
                    htmlString.append("<td>").append("null").append("</td>");
                    continue;
                }
                htmlString.append("<td>").append(rowData.toString()).append("</td>");

            }
            htmlString.append("</tr>");
        }

        // close html table string
        htmlString.append("</table></body></html>");

        File outputFile = new File(outputFilePath);

        try {
            // create path directories if non-existent
            outputFile.getParentFile().mkdirs();

            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
                bufferedWriter.write(htmlString.toString());
                bufferedWriter.close();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        } catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
}
