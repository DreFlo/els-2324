package pt.up.fe.els2023.Command.Extract;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Table.Table;

import java.util.*;
import java.util.function.Function;

import javafx.util.Pair;

public abstract class Extract<ExtractArgument> implements Command {
    private String sourceColumn;
    private List<String> comparisonKeys;
    private Map<String, String> unwindColumns;
    private int numberOfColumns = 1;
    private final Comparator<Map<?, ?>> mapComparator = (map1, map2) -> {
        for (String key : getComparisonKeys()) {
            if (!map1.containsKey(key) || !map2.containsKey(key)) {
                return 0;
            }

            Object value1 = map1.get(key);
            Object value2 = map2.get(key);

            if (map1.get(key).equals(map2.get(key))) {
                continue;
            }

            if (value1 instanceof Comparable comparable1 && value2 instanceof Comparable comparable2) {
                return comparable1.compareTo(comparable2);
            }

            return 0;
        }
        return 0;
    };

    public Extract() {
        comparisonKeys = new ArrayList<>();
        unwindColumns = new HashMap<>();
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

        List<List<Map<String, Object>>> values = getValues(column);

        List<Pair<String, List<Object>>> newColumns = new ArrayList<>();

        for (int i = 0; i < getNumberOfColumns(); i++) {
            for (String newHeader : unwindColumns.keySet()) {
                List<Object> valuesToAdd = new ArrayList<>();

                for (Object object : values.get(i)) {
                    if (!(object instanceof Map<?, ?> map)) {
                        throw new Exception(sourceColumn + " is not a map");
                    }
                    valuesToAdd.add(map.get(newHeader));
                }

                String newColumnName = sourceColumn + '/' + unwindColumns.get(newHeader);

                if (getNumberOfColumns() > 1) {
                    newColumnName += " #" + (i + 1);
                }

                newColumns.add(new Pair<>(newColumnName, valuesToAdd));
            }
        }

        for (Pair<String, List<Object>> newColumn : newColumns) {
            table.addColumn(newColumn.getKey(), newColumn.getValue());
        }

        table.removeColumn(sourceColumn);

        return table;
    }

    private List<List<Map<String, Object>>> getValues(List<Object> column) throws Exception {
        List<List<Map<String, Object>>> values = new ArrayList<>();

        for (Object cell : column) {
            List<Map<String, Object>> cellList = new ArrayList<>();

            for (Object object : (List<?>) cell) {
                if (!(object instanceof Map<?, ?>)) {
                    throw new Exception(sourceColumn + " is not a list of maps");
                }
                cellList.add((Map<String, Object>) object);
            }
            cellList.sort(mapComparator);
            values.add(selector(cellList));
        }

        return values;
    }

    public void setSourceColumn(String sourceColumn) {
        this.sourceColumn = sourceColumn;
    }

    public void setComparisonKeys(List<String> comparisonKeys) {
        this.comparisonKeys = comparisonKeys;
    }

    public void addComparisonKey(String comparisonKey) {
        this.comparisonKeys.add(comparisonKey);
    }

    public List<String> getComparisonKeys() {
        return comparisonKeys;
    }

    public void setUnwindColumns(Map<String, String> unwindColumns) {
        this.unwindColumns = unwindColumns;
    }

    public void addUnwindColumn(String unwindColumn) {
        this.unwindColumns.put(unwindColumn, unwindColumn);
    }

    public void addUnwindColumn(String unwindColumn, String newHeader) {
        this.unwindColumns.put(unwindColumn, newHeader);
    }

    protected void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    protected int getNumberOfColumns() {
        return numberOfColumns;
    }

    protected abstract List<Map<String, Object>> selector(List<Map<String, Object>> cellList);
}
