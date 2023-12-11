package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLRenameColumn;

import pt.up.fe.els2023.Command.RenameColumn.RenameColumnReplace;

public class DSLRenameColumnReplace extends DSLRenameColumnByPattern<RenameColumnReplace> {
    public DSLRenameColumnReplace(pt.up.fe.els2023.InternalDSL.DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new RenameColumnReplace());
    }

    public DSLRenameColumnReplace with(String pattern) {
        getCommand().setReplacement(pattern);
        return this;
    }

    @Override
    public DSLRenameColumnReplace matchColumns(String pattern) {
        return (DSLRenameColumnReplace) super.matchColumns(pattern);
    }
}
