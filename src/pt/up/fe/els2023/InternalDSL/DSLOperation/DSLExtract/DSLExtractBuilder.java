package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExtractBuilder {
    private final DSLTableBuilder dslTableBuilder;

    public DSLExtractBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLExtractByKey byKey() {
        return new DSLExtractByKey(dslTableBuilder);
    }

    public DSLExtractTopN top() {
        return new DSLExtractTopN(dslTableBuilder);
    }
}
