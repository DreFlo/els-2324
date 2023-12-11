package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLRenameColumn;

import pt.up.fe.els2023.Command.RenameColumn.RenameColumnTo;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLOperation;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLRenameColumnTo extends DSLOperation<RenameColumnTo> {
    public DSLRenameColumnTo(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new RenameColumnTo());
    }

    public DSLRenameColumnTo column(String column) {
        getCommand().setOldName(column);
        return this;
    }

    public DSLRenameColumnTo to(String column) {
        getCommand().setNewName(column);
        return this;
    }
}
