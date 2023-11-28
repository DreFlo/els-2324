package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLFilterBlacklist extends DSLFilterList {
    public DSLFilterBlacklist(DSLTableBuilder dslTableBuilder, DSLFilter dslFilter) {
        super(dslTableBuilder, dslFilter);
    }

    public DSLFilterBlacklist column(String... string) {
        for (String column : string) {
            dslFilter.getCommand().addBlacklistedColumn(column);
        }
        return this;
    }

    public DSLFilterBlacklist objectOfType(Class<?>... objectType) {
        for (Class<?> type : objectType) {
            dslFilter.getCommand().addBlacklistedType(type);
        }
        return this;
    }
}
