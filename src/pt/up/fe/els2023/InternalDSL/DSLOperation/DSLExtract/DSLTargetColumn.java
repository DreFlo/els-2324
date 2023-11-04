package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLTargetColumn extends DSLExtract {
    DSLExtract dslExtract;

    DSLTargetColumn(DSLTableBuilder dslTableBuilder, DSLExtract dslExtract) {
        super(dslTableBuilder);
        this.dslExtract = dslExtract;
    }

    public DSLTargetColumn column(String column) {
        getCommand().setTargetColumn(column);
        return this;
    }

}
