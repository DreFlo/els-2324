package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLRenameColumn;

import pt.up.fe.els2023.Command.RenameColumn.RenameColumnPrepend;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLRenameColumnPrepend extends DSLRenameColumnByPattern<RenameColumnPrepend> {
    public DSLRenameColumnPrepend(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new RenameColumnPrepend());
    }

    public DSLRenameColumnPrepend with(String prefix) {
        getCommand().setPrepend(prefix);
        return this;
    }

    @Override
    public DSLRenameColumnPrepend matchColumns(String pattern) {
        return (DSLRenameColumnPrepend) super.matchColumns(pattern);
    }
}
