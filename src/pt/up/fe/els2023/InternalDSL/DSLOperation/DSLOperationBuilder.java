package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract.DSLExtractBuilder;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter.DSLFilter;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLRenameColumn.DSLRenameColumnBuilder;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLRenameColumn.DSLRenameColumnTo;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;


public class DSLOperationBuilder {
    private final DSLTableBuilder dslTableBuilder;

    public DSLOperationBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLSelect select() {
        return new DSLSelect(dslTableBuilder);
    }

    public DSLRenameColumnBuilder renameColumn() {
        return new DSLRenameColumnBuilder(dslTableBuilder);
    }

    public DSLSquashRows squashBy() {
        return new DSLSquashRows(dslTableBuilder);
    }

    public DSLExtractBuilder extract() { return new DSLExtractBuilder(dslTableBuilder); }

    public DSLFilter filter() { return new DSLFilter(dslTableBuilder); }

    public DSLReduce reduce() {
        return new DSLReduce(dslTableBuilder);
    }
}
