package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExclude;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLCondition extends DSLExclude{
    DSLExclude dslExclude;
    public DSLCondition(DSLTableBuilder dslTableBuilder, DSLExclude dslExclude) {
        super(dslTableBuilder);
        this.dslExclude = dslExclude;
    }

    public DSLCondition column(String string) {
        dslExclude.getCommand().addCondition(string);
        return this;
    }

    public DSLCondition objectType(Class<?> objectType) {
        getCommand().addCondition(objectType);
        return this;
    }

    public DSLExclude endCondition() {
        return dslExclude;
    }
}
