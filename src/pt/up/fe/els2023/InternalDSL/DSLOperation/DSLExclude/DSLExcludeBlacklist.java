package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExclude;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExcludeBlacklist {
    DSLTableBuilder dslTableBuilder;
    DSLExclude dslExclude;
    public DSLExcludeBlacklist(DSLTableBuilder dslTableBuilder, DSLExclude dslExclude) {
        this.dslTableBuilder = dslTableBuilder;
        this.dslExclude = dslExclude;
    }

    public DSLExcludeBlacklist column(String string) {
        dslExclude.getCommand().addCondition(string);
        return this;
    }

    public DSLExcludeBlacklist objectType(Class<?> objectType) {
        dslExclude.getCommand().addCondition(objectType);
        return this;
    }

    public DSLExclude end() {
        return dslExclude;
    }
}
