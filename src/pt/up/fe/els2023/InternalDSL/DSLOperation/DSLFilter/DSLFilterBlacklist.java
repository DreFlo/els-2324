package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLFilterBlacklist extends DSLFilterList {
    public DSLFilterBlacklist(DSLTableBuilder dslTableBuilder, DSLFilter dslFilter) {
        super(dslTableBuilder, dslFilter);
    }

    public DSLFilterBlacklist column(String string) {
        dslFilter.getCommand().addBlacklistedColumn(string);
        return this;
    }

    public DSLFilterBlacklist objectOfType(Class<?> objectType) {
        dslFilter.getCommand().addBlacklistedType(objectType);
        return this;
    }
}
