package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract;

import pt.up.fe.els2023.Command.Extract.ExtractByKey;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExtractByKey extends DSLExtract<ExtractByKey> {
    public DSLExtractByKey(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new ExtractByKey());
    }

    public DSLExtractByKey extract(String key) {
        getCommand().setSelector(key);
        return this;
    }
}
