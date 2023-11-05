package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public abstract class DSLFilterList {
    DSLTableBuilder dslTableBuilder;
    DSLExclude dslExclude;

    public DSLFilterList(DSLTableBuilder dslTableBuilder, DSLExclude dslExclude) {
        this.dslTableBuilder = dslTableBuilder;
        this.dslExclude = dslExclude;
    }

    public abstract DSLFilterList column(String string);

    public abstract DSLFilterList objectOfType(Class<?> objectType);

    public DSLExclude end() {
        return dslExclude;
    }
}
