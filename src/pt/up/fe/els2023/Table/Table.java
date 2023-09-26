package pt.up.fe.els2023.Table;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<String> headers;
    private List<Row> rows;

    public void Table(List<String> headers) {
        this.headers = headers;
        this.rows = new ArrayList<>();
    }

    public void addRow(Row row) {
        rows.add(row);
    }

}
