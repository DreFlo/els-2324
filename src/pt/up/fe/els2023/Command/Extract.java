package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.*;
import java.util.function.Function;

import javafx.util.Pair;

public class Extract implements Command{
    String sourceColumn;
    Function<List<?>, Object> selector;
    Comparator<Object> comparator;
    List<String> unwindColumns;

    public Extract() {
        unwindColumns = new ArrayList<>();
    }

    @Override
    public Table execute(Table table) throws Exception {
        List<String> headers = table.getHeaders();
        if (!headers.contains(sourceColumn)) {
            throw new Exception(sourceColumn + " is not a column from the table");
        }

        List<Object> column = table.getColumn(sourceColumn);

        for (Object cell : column) {
            if (!(cell instanceof List)) {
                throw new Exception(sourceColumn + " is not a list");
            }
        }

        List<Object> values = new ArrayList<>();

        for (Object cell : column) {
            List<?> cellList = (List<?>) cell;

            cellList.sort(comparator);

            values.add(selector.apply(cellList));
        }

        List<Pair<String, List<Object>>> newColumns = new ArrayList<>();

        for (String newHeader : unwindColumns) {
            List<Object> valuesToAdd = new ArrayList<>();

            for (Object object : values) {
                if (!(object instanceof Map<?, ?> map)) {
                    throw new Exception(sourceColumn + " is not a map");
                }
                valuesToAdd.add(map.get(newHeader));
            }

            newColumns.add(new Pair<>(sourceColumn + '/' + newHeader, valuesToAdd));
        }

        for (Pair<String, List<Object>> newColumn : newColumns) {
            table.addColumn(newColumn.getKey(), newColumn.getValue());
        }

        table.removeColumn(sourceColumn);

        return table;
    }

    public void setSourceColumn(String sourceColumn) {
        this.sourceColumn = sourceColumn;
    }

    public void setSelector(Function<List<?>, Object> selector) {
        this.selector = selector;
    }

    public void addUnwindColumn(String unwindColumn) {
        this.unwindColumns.add(unwindColumn);
    }

    public void setSortComparator(Comparator<Object> comparator) {
        this.comparator = comparator;
    }
}
