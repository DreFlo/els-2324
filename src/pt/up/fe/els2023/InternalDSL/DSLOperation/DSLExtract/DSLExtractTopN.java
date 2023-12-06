package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract;

import pt.up.fe.els2023.Command.Extract.ExtractTopN;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExtractTopN extends DSLExtract<ExtractTopN, Integer>{
    public DSLExtractTopN(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new ExtractTopN());
    }
}
