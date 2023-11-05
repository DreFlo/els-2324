package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.Extract;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class DSLExtract extends DSLOperation<Extract> {
    public DSLExtract(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new Extract());
    }

    public DSLExtract get(String... unwindColumns) {
        for (String column : unwindColumns) {
            getCommand().addUnwindColumn(column);
        }
        return this;
    }

    public DSLExtract from(String sourceColumn) {
        getCommand().setSourceColumn(sourceColumn);
        return this;
    }
    
    public DSLExtract select(Function<List<?>, Object> selector) {
        getCommand().setSelector(selector);
        return this;
    }

    public DSLExtract sortBy(Comparator<Map<?, ?>> comparator) {
        getCommand().setSortComparator(comparator);
        return this;
    }

}

