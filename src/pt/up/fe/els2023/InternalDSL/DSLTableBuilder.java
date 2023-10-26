package pt.up.fe.els2023.InternalDSL;

import pt.up.fe.els2023.InternalDSL.DSLOperationsBuilder.DSLOperationsBuilder;
import pt.up.fe.els2023.InternalDSL.DSLSourceBuilder.DSLSourceBuilder;
import pt.up.fe.els2023.Table.Table;

public class DSLTableBuilder {
    private final InternalDSL internalDSL;

    private Table table;

    public DSLTableBuilder(InternalDSL internalDSL) {
        this.internalDSL = internalDSL;
        this.table = new Table();
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public DSLTableBuilder name(String name) {
        table.setName(name);
        return this;
    }

    public DSLSourceBuilder source() {
        return new DSLSourceBuilder(this);
    }

    public DSLOperationsBuilder operation() {
        return new DSLOperationsBuilder(this);
    }

    public InternalDSL end() {
        // TODO add table to internalDSL
        return internalDSL;
    }
}

