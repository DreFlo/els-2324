package pt.up.fe.els2023.Table;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<String> headers;
    private List<List<Object>> rows;

    public Table(List<String> headers) {
        this.headers = headers;
        this.rows = new ArrayList<>(new ArrayList<>());
    }

    public void addRow(List<Object> row) {
        rows.add(row);
    }

    // TODO: Dar check a isto, que pode nao ficar na mesma ordem
    public void addRows(List<List<Object>> rows) {
        this.rows.addAll(rows);
    }

    public List<String> getHeaders() {
        return headers;
    }

    public List<List<Object>> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        return "Table{" +
                "headers=" + headers +
                ", rows=" + rows +
                '}';
    }
}
