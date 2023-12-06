package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract;

import pt.up.fe.els2023.Command.Extract.ExtractTopN;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExtractTopN extends DSLExtract<ExtractTopN>{
    public DSLExtractTopN(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new ExtractTopN());
    }

    public DSLExtractTopN extractTop(int n) {
        getCommand().setN(n);
        return this;
    }
}
