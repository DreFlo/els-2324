package pt.up.fe.els2023.Table;

import java.util.List;

public class Row {
    private List<Object> rowData;

    public void Row(List<Object> rowData) {
        this.rowData = rowData;
    }

    public List<Object> getRowData() {
        return rowData;
    }
}
