package pt.up.fe.els2023.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table {
    private final String name;
    private final List<String> headers;
    private final List<List<Object>> rows;

    public Table(String name, List<String> headers) {
        this.name = name;
        this.headers = headers;
        this.rows = new ArrayList<>(new ArrayList<>());
    }

    public Table(String name, List<String> headers, List<List<Object>> rows) {
        this.name = name;
        this.headers = headers;
        this.rows = rows;
    }

    public void addRow(List<Object> row) {
        rows.add(row);
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table table)) return false;
        return name.equals(table.name) && getHeaders().equals(table.getHeaders()) && getRows().equals(table.getRows());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }
}
