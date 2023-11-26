package pt.up.fe.els2023.InternalDSL.DSLSource;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLSourceBuilder {
    private final DSLTableBuilder dslTableBuilder;

    public DSLSourceBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLTableBuilder getDSLTableBuilder() {
        return dslTableBuilder;
    }

    public final DSLFileSystemSource fileSystemSource() {
        return new DSLFileSystemSource(dslTableBuilder);
    }

    public DSLTableBuilder end() {
        return dslTableBuilder;
    }
}
