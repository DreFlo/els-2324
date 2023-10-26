package pt.up.fe.els2023.Table;

import java.util.*;

public class Table {
    private String name;
    private List<String> headers;
    private List<List<Object>> rows;

    public Table(){
        headers = new ArrayList<>();
        rows = new ArrayList<>(new ArrayList<>());
    }

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

    public void extendTable(Map<String, Object> objectMap) {
        List<String> keys = new ArrayList<>(objectMap.keySet());

        List<Object> row = new ArrayList<>();
        for (String key: keys) {
            if (!headers.contains(key)) {
                headers.add(key);
            }
            row.add(headers.indexOf(key), objectMap.get(key));
        }
        addRow(row);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public void setRows(List<List<Object>> rows) {
        this.rows = rows;
    }

    public String getName() {
        return name;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public List<List<Object>> getRows() {
        return rows;
    }

    public void addRow(List<Object> row) {
        rows.add(row);
    }

    public void addRows(List<List<Object>> rows) {
        this.rows.addAll(rows);
    }

    @Override
    public String toString() {
        return "Table{" +
                "name=" + name +
                ", headers=" + headers +
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
}
