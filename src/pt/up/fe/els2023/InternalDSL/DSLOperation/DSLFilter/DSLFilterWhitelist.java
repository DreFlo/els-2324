package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLFilterWhitelist extends DSLFilterList {
    public DSLFilterWhitelist(DSLTableBuilder dslTableBuilder, DSLExclude dslExclude) {
        super(dslTableBuilder, dslExclude);
    }

    @Override
    public DSLFilterList column(String string) {
        dslExclude.getCommand().addWhitelistedColumn(string);
        return this;
    }

    @Override
    public DSLFilterList objectOfType(Class<?> objectType) {
        dslExclude.getCommand().addWhitelistedType(objectType);
        return this;
    }
}
