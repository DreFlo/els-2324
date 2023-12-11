package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLRenameColumn;

import pt.up.fe.els2023.Command.RenameColumn.RenameColumnAppend;

public class DSLRenameColumnAppend extends DSLRenameColumnByPattern<RenameColumnAppend> {
    public DSLRenameColumnAppend(pt.up.fe.els2023.InternalDSL.DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new RenameColumnAppend());
    }

    public DSLRenameColumnAppend with(String suffix) {
        getCommand().setAppend(suffix);
        return this;
    }

    @Override
    public DSLRenameColumnAppend matchColumns(String pattern) {
        return (DSLRenameColumnAppend) super.matchColumns(pattern);
    }
}
