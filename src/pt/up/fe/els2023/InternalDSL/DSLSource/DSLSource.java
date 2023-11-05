package pt.up.fe.els2023.InternalDSL.DSLSource;

import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;
import pt.up.fe.els2023.Table.Table;

import java.util.List;
import java.util.Map;

public abstract class DSLSource<S extends Source> {
    private final DSLTableBuilder dslTableBuilder;
    private final S source;

    public DSLSource(DSLTableBuilder dslTableBuilder, S source) {
        this.dslTableBuilder = dslTableBuilder;
        this.source = source;
    }

    public S getSource() {
        return source;
    }

    public DSLTableBuilder getDSLTableBuilder() {
        return dslTableBuilder;
    }

    protected abstract List<Map<String, Object>> getTableRows();

    public final DSLTableBuilder end() {
        Table table = getDSLTableBuilder().getTable();

        for (Map<String, Object> row : getTableRows()) {
            table.extendTable(row);
        }

        return getDSLTableBuilder();
    }
}
