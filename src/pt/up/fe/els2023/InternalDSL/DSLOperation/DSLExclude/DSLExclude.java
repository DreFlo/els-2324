package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExclude;

import pt.up.fe.els2023.Command.Exclude;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLOperation;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExclude extends DSLOperation<Exclude> {

    public DSLExclude(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new Exclude());
    }

    public DSLExcludeBlacklist blacklist() {
        return new DSLExcludeBlacklist(dslTableBuilder, this);
    }
}
