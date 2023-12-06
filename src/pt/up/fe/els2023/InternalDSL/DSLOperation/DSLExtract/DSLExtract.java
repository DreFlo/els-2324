package pt.up.fe.els2023.InternalDSL.DSLOperation.DSLExtract;

import pt.up.fe.els2023.Command.Extract.Extract;
import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLOperation;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public abstract class DSLExtract<E extends Extract<EA>, EA> extends DSLOperation<E> {
    public DSLExtract(DSLTableBuilder dslTableBuilder, E extract) {
        super(dslTableBuilder, extract);
    }

    public DSLExtract<E, EA> get(String... unwindColumns) {
        for (String column : unwindColumns) {
            getCommand().addUnwindColumn(column);
        }
        return this;
    }

    public DSLExtract<E, EA> get(Map<String, String> unwindColumns) {
        for (Map.Entry<String, String> entry : unwindColumns.entrySet()) {
            getCommand().addUnwindColumn(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public DSLExtract<E, EA> from(String sourceColumn) {
        getCommand().setSourceColumn(sourceColumn);
        return this;
    }

    public DSLExtract<E, EA> sortBy(String... keys) {
        for (String key : keys) {
            getCommand().addComparisonKey(key);
        }
        return this;
    }

    public DSLExtract<E, EA> sortBy(List<String> keys) {
        for (String key : keys) {
            getCommand().addComparisonKey(key);
        }
        return this;
    }

    public DSLExtract<E, EA> extract(EA extractArgument) {

    }
}

