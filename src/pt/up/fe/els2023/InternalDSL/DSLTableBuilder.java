package pt.up.fe.els2023.InternalDSL;

import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLOperationBuilder;
import pt.up.fe.els2023.InternalDSL.DSLOutput.DSLOutputBuilder;
import pt.up.fe.els2023.InternalDSL.DSLSource.DSLSourceBuilder;
import pt.up.fe.els2023.Table.Table;

public class DSLTableBuilder {
    private Table table;

    public DSLTableBuilder() {
        this.table = new Table();
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public DSLSourceBuilder source() {
        return new DSLSourceBuilder(this);
    }

    public DSLOperationBuilder operation() {
        return new DSLOperationBuilder(this);
    }

    public DSLTableBuilder outputTo(String path) {
        return new DSLOutputBuilder(this).outputTo(path);
    }

    public DSLTableBuilder end() {
        return this;
    }
}

