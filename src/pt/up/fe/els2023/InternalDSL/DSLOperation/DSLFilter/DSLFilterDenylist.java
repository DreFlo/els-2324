package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLFilterDenylist extends DSLFilterList {
    public DSLFilterDenylist(DSLTableBuilder dslTableBuilder, DSLFilter dslFilter) {
        super(dslTableBuilder, dslFilter);
    }

    public DSLFilterDenylist column(String... string) {
        for (String column : string) {
            dslFilter.getCommand().addDenylistedColumn(column);
        }
        return this;
    }

    public DSLFilterDenylist objectOfType(Class<?>... objectType) {
        for (Class<?> type : objectType) {
            dslFilter.getCommand().addDenylistedType(type);
        }
        return this;
    }
}
