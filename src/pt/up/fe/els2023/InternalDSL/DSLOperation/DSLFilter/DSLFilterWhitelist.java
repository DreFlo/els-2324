package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLFilterWhitelist extends DSLFilterList {
    public DSLFilterWhitelist(DSLTableBuilder dslTableBuilder, DSLFilter dslFilter) {
        super(dslTableBuilder, dslFilter);
    }

    @Override
    public DSLFilterList column(String string) {
        dslFilter.getCommand().addWhitelistedColumn(string);
        return this;
    }

    @Override
    public DSLFilterList objectOfType(Class<?> objectType) {
        dslFilter.getCommand().addWhitelistedType(objectType);
        return this;
    }
}
