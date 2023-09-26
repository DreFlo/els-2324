package pt.up.fe.els2023.Table;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<String> headers;
    private List<List<Object>> rows;

    public void Table(List<String> headers) {
        this.headers = headers;
        this.rows = new ArrayList<>(new ArrayList<>());
    }

    public void addRow(List<Object> row) {
        rows.add(row);
    }

}
