package pt.up.fe.els2023.Command.Reduce;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Reduce implements Command {
    ReduceFunctions function;
    Class<?> objectType;


    public Reduce() {
        function = null;
        objectType = null;
    }

    public void setFunction(ReduceFunctions function) {
        this.function = function;
    }

    public void setObjectType(Class<?> objectType) {
        this.objectType = objectType;
    }

    @Override
    public Table execute(Table table) {
        table.addColumn("0__generated", Collections.nCopies(table.getRows().size(), null));

        int generatedIndex = table.getHeaders().indexOf("0__generated");

        List<List<Object>> tableRows = table.getRows();
        List<Object> firstRow = tableRows.get(tableRows.size()-1);
        List<Object> res = new ArrayList<>();

        for (int i = 0; i < firstRow.size(); i++) {
            Object columnRes = null;

            if (firstRow.get(i) != null && objectType.isAssignableFrom(firstRow.get(i).getClass())) {
                List<Object> list = new ArrayList<>();

                for (List<Object> obj : tableRows) {
                    if (obj.get(generatedIndex) != null) {
                        continue;
                    }
                    list.add(obj.get(i));
                }

                columnRes = applyFunction(list);
            }
            res.add(columnRes);
        }

        res.set(generatedIndex, function.toString());
        table.addRow(res);
        return table;
    }

    private Object applyFunction(List<Object> list) {
        return switch (function) {
            case SUM -> list.isEmpty() ? null : list.stream().mapToDouble(this::toDouble).sum();
            case AVG -> list.isEmpty() ? null : list.stream().mapToDouble(this::toDouble).average().orElse(0.0);
        };

    }

    private double toDouble(Object element) {
        if (element instanceof Number) {
            return ((Number) element).doubleValue();
        } else {
            throw new IllegalArgumentException("Unsupported element type for AVERAGE and SUM");
        }
    }
}
