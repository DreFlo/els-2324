package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.Extract;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLExtract extends DSLOperation<Extract> {
    public DSLExtract(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new Extract());
    }

    public DSLExtract get(String getColumn) {
        getCommand().setGetColumn(getColumn);
        return this;
    }

    public DSLExtract from(String sourceColumn) {
        getCommand().setSourceColumn(sourceColumn);
        return this;
    }
    
    public DSLExtract select(String string) {
        getCommand().setFunction(string);
        return this;
    }

    // Default sort
    public DSLExtract sortBy() {
        return this;
    }

    public DSLExtract sortBy(String sort) {
        getCommand().setSort(sort);
        return this;
    }

    public DSLExtract to(String column) {
        getCommand().setTargetColumn(column);
        return this;
    }

}

