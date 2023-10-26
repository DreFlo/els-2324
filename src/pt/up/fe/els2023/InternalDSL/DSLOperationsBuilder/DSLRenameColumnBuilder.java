package pt.up.fe.els2023.InternalDSL.DSLOperationsBuilder;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Command.RenameColumn;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLRenameColumnBuilder extends DSLOperationsBuilder{
    public DSLRenameColumnBuilder(DSLTableBuilder dslTableBuilder, Command command) {
        super(dslTableBuilder, command);
    }

    public DSLRenameColumnBuilder from(String column) {
        ((RenameColumn) getCommand()).setOldName(column);
        return this;
    }

    public DSLRenameColumnBuilder to(String column) {
        ((RenameColumn) getCommand()).setNewName(column);
        return this;
    }
}
