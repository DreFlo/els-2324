package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLFilterBlacklist extends DSLFilterList {
    public DSLFilterBlacklist(DSLTableBuilder dslTableBuilder, DSLExclude dslExclude) {
        super(dslTableBuilder, dslExclude);
    }

    public DSLFilterBlacklist column(String string) {
        dslExclude.getCommand().addBlacklistedColumn(string);
        return this;
    }

    public DSLFilterBlacklist objectOfType(Class<?> objectType) {
        dslExclude.getCommand().addBlacklistedType(objectType);
        return this;
    }
}
