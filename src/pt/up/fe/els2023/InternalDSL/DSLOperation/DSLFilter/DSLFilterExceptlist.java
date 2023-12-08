package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLFilterExceptlist extends DSLFilterList {
    public DSLFilterExceptlist(DSLTableBuilder dslTableBuilder, DSLFilter dslFilter) {
        super(dslTableBuilder, dslFilter);
    }

    @Override
    public DSLFilterList column(String... string) {
        for (String column : string) {
            dslFilter.getCommand().addExceptlistedColumn(column);
        }
        return this;
    }

    @Override
    public DSLFilterList objectOfType(Class<?>... objectType) {
        for (Class<?> type : objectType) {
            dslFilter.getCommand().addExceptlistedType(type);
        }
        return this;
    }
}
