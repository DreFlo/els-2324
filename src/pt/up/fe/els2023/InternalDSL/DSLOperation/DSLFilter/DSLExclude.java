package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.Command.Filter;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLOperation;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExclude extends DSLOperation<Filter> {

    public DSLExclude(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new Filter());
    }

    public DSLFilterBlacklist blacklist() {
        return new DSLFilterBlacklist(dslTableBuilder, this);
    }

    public DSLFilterWhitelist whitelist() {
        return new DSLFilterWhitelist(dslTableBuilder, this);
    }
}
