package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLRenameColumn;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLRenameColumnBuilder {
    private final DSLTableBuilder dslTableBuilder;

    public DSLRenameColumnBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLRenameColumnTo rename() {
        return new DSLRenameColumnTo(dslTableBuilder);
    }

    public DSLRenameColumnPrepend prepend() {
        return new DSLRenameColumnPrepend(dslTableBuilder);
    }

    public DSLRenameColumnAppend append() {
        return new DSLRenameColumnAppend(dslTableBuilder);
    }

    public DSLRenameColumnReplace replace() {
        return new DSLRenameColumnReplace(dslTableBuilder);
    }
}
