package pt.up.fe.els2023.InternalDSL;

import pt.up.fe.els2023.Table.Table;

import java.util.HashMap;
import java.util.Map;

public class InternalDSL {
    private final Map<String, Table> tables;

    public InternalDSL() {
        this.tables = new HashMap<>();
    }

    public void addTable(Table table) {
        tables.put(table.getName(), table);
    }

    public DSLTableBuilder table() {
        return new DSLTableBuilder(this);
    }
}
