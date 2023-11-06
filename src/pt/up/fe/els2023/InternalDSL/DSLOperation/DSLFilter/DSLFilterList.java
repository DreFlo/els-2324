package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLFilter;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public abstract class DSLFilterList {
    DSLTableBuilder dslTableBuilder;
    DSLFilter dslFilter;

    public DSLFilterList(DSLTableBuilder dslTableBuilder, DSLFilter dslFilter) {
        this.dslTableBuilder = dslTableBuilder;
        this.dslFilter = dslFilter;
    }

    public abstract DSLFilterList column(String string);

    public abstract DSLFilterList objectOfType(Class<?> objectType);

    public DSLFilter end() {
        return dslFilter;
    }
}
