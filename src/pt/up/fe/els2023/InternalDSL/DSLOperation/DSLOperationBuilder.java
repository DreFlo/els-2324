package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter.DSLExclude;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;


public class DSLOperationBuilder {
    private final DSLTableBuilder dslTableBuilder;

    public DSLOperationBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLSelect select() {
        return new DSLSelect(dslTableBuilder);
    }

    public DSLRenameColumn renameColumn() {
        return new DSLRenameColumn(dslTableBuilder);
    }

    public DSLSquashRows squashRows() {
        return new DSLSquashRows(dslTableBuilder);
    }

    public DSLExtract extract() { return new DSLExtract(dslTableBuilder); }

    public DSLExclude filter() { return new DSLExclude(dslTableBuilder); }
}
