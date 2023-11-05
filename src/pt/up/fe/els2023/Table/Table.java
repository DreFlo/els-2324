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
        List<Object> row = new ArrayList<>();
        for (String header: objectMap.keySet()) {
            if (!getHeaders().contains(header)) {
                getHeaders().add(header);
            }
        }
        for (String header: getHeaders()) {
            row.add(objectMap.getOrDefault(header, null));
        }
        addRow(row);
        updateRows();
    }

    public List<Object> getColumn(String header) throws Exception {
        List<Object> values = new ArrayList<>();
        int headerIndex = headers.indexOf(header);

        if (headerIndex == -1) {
            throw new Exception(header + " is not in the table " + name);
        }

        for (List<Object> row: rows) {
            values.add(row.get(headerIndex));
        }

        return values;
    }

    public boolean removeColumn(String column) {
        int index = headers.indexOf(column);
        if (index == -1) {
            return false;
        }
        headers.remove(index);
        for (List<Object> row: rows) {
            row.remove(index);
        }
        return true;
    }

    public boolean addColumn(String column, List<Object> values) {
        if (headers.contains(column)) {
            return false;
        }
        headers.add(column);
        for (int i = 0; i < rows.size(); i++) {
            if (i < values.size()) {
                rows.get(i).add(values.get(i));
            } else {
                rows.get(i).add(null);
            }
        }
        return true;
    }

    private void updateRows() {
        List<List<Object>> newRows = new ArrayList<>();
        for (List<Object> row: getRows()) {
            List<Object> newRow = new ArrayList<>();
            for (String header: getHeaders()) {
                if (row.size() > getHeaders().indexOf(header)) {
                    newRow.add(row.get(getHeaders().indexOf(header)));
                } else {
                    newRow.add(null);
                }
            }
            newRows.add(newRow);
        }
        setRows(newRows);
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
