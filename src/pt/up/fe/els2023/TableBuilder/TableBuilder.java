package pt.up.fe.els2023.TableBuilder;


import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TableBuilder {
    List<InputFileParser> inputFileParserList;

    public TableBuilder(List<InputFileParser> inputFileParserList) {
        this.inputFileParserList = inputFileParserList;
    }

    public Table build() {
        List<List<Object>> rows = new ArrayList<>();
        List<String> headers = new ArrayList<>();

        for (InputFileParser inputFileParser: inputFileParserList) {
            Map<String, Object> flattenedRow = inputFileParser.getFlattenedRow();

            List<String> keys = new ArrayList<>(flattenedRow.keySet());

            List<Object> row = new ArrayList<>();
            for (String key: keys) {
                if (!headers.contains(key)) {
                    headers.add(key);
                }
                row.add(headers.indexOf(key), flattenedRow.get(key));
            }
            rows.add(row);
        }

        Table table = new Table(headers);
        table.addRows(rows);
        return table;

    }
}
