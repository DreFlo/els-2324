package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract;

import pt.up.fe.els2023.Command.Extract;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLOperation;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExtract extends DSLOperation<Extract> {
    public DSLExtract(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new Extract());
    }

    public DSLExtract sourceColumn(String sourceColumn) {
        getCommand().setSourceColumn(sourceColumn);
        return this;
    }
    
    public DSLExtract function(String string) {
        getCommand().setFunction(string);
        return this;
    }

    // Default sort
    public DSLExtract sort() {
        return this;
    }

    public DSLExtract sort(String sort) {
        getCommand().setSort(sort);
        return this;
    }

    public DSLTargetColumn targetColumn() {
        return new DSLTargetColumn(dslTableBuilder, this);
    }

}

