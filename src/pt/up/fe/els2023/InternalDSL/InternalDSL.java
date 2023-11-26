package pt.up.fe.els2023.InternalDSL;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InternalDSL {
    private final List<Table> tables;

    public InternalDSL() {
        this.tables = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public DSLTableBuilder table() {
        return new DSLTableBuilder(this);
    }
}
