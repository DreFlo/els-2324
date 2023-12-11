package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLRenameColumn;

import pt.up.fe.els2023.Command.RenameColumn.RenameColumnByPattern;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLOperation;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public abstract class DSLRenameColumnByPattern<T extends RenameColumnByPattern> extends DSLOperation<T> {
    public DSLRenameColumnByPattern(DSLTableBuilder dslTableBuilder, T command) {
        super(dslTableBuilder, command);
    }

    protected DSLRenameColumnByPattern<T> matchColumns(String pattern) {
        getCommand().setPattern(pattern);
        return this;
    }
}
