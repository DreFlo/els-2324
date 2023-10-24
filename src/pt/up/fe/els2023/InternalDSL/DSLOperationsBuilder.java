package pt.up.fe.els2023.InternalDSL;

import java.util.List;

public class DSLOperationsBuilder {
    private final DSLTableBuilder dslTableBuilder;

    private String type;
    private List<String> columns;

    DSLOperationsBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLOperationsBuilder type(String type) {
        this.type = type;
        return this;
    }

    public DSLOperationsBuilder column(String column) {
        this.columns.add(column);
        return this;
    }

    public DSLTableBuilder end() {
        // TODO: do operations

        return dslTableBuilder;
    }
}
