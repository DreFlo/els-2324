package pt.up.fe.els2023.InternalDSL;

import pt.up.fe.els2023.Table.Table;

public class DSLTableBuilder {
    private final InternalDSL internalDSL;

    private final Table table;

    public DSLTableBuilder(InternalDSL internalDSL) {
        this.internalDSL = internalDSL;
        this.table = new Table();
    }

    public DSLTableBuilder name(String name) {
        table.setName(name);
        return this;
    }

    public DSLSourcesBuilder source() {
        // TODO: sources builder
        return new DSLSourcesBuilder(this);
    }

    public DSLOperationsBuilder operation() {
        // TODO: operations builder
        return new DSLOperationsBuilder(this);
    }

    public InternalDSL end() {
        // TODO add table to internalDSL
        return internalDSL;
    }

    public Table getTable() {
        return table;
    }
}

