package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.RenameColumn;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLRenameColumn extends DSLOperation<RenameColumn> {
    public DSLRenameColumn(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new RenameColumn());
    }

    public DSLRenameColumn from(String column) {
        getCommand().setOldName(column);
        return this;
    }

    public DSLRenameColumn to(String column) {
        getCommand().setNewName(column);
        return this;
    }

    public DSLRenameColumn prepend(String prefix) {
        getCommand().setPrefix(prefix);
        return this;
    }

    public DSLRenameColumn append(String suffix) {
        getCommand().setSuffix(suffix);
        return this;
    }
}
