package pt.up.fe.els2023.Command.Reduce;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public abstract class Reduce<ReduceArgument> implements Command {
    Function<List<?>, Object> function;
    Class<?> objectType;

    private ReduceArgument selector;

    public Reduce() {
        function = null;
        objectType = null;
    }

    public void setSelector(ReduceArgument selector) {
        this.selector = selector;
    }

    public ReduceArgument getSelector() { return selector; }

    public void setFunction(Function<List<?>, Object> function) {
        this.function = function;
    }
    public Function<List<?>, Object> getFunction() {
        return this.function;
    }

    public void setObjectType(Class<?> objectType) {
        this.objectType = objectType;
    }

    public Class<?> getObjectType() {
        return this.objectType;
    }

    @Override
    public Table execute(Table table) {
        table.addColumn("generated", Collections.nCopies(table.getHeaders().size(), false));

        List<List<Object>> tableRows = table.getRows();
        List<String> headers = table.getHeaders();
        int generatedIndex = -1;
        if (tableRows.isEmpty()) return table;
        for (int i = 0; i < headers.size(); i++) {
            if (Objects.equals(headers.get(i), "generated")) {
                generatedIndex = i;
                break;
            }
        }

        List<Object> firstRow = tableRows.get(tableRows.size()-1);
        List<Object> res = new ArrayList<>();

        for (int i = 0; i < firstRow.size(); i++) {
            Object columnRes = null;

            if (firstRow.get(i) != null && firstRow.get(i).getClass() == objectType) {
                List<Object> list = new ArrayList<>();

                for (List<Object> obj : tableRows) {
                    if (!(Boolean) obj.get(generatedIndex)) {
                        list.add(obj.get(i));
                    }
                }

                columnRes = function.apply(list);
            }
            res.add(columnRes);
        }
        res.set(generatedIndex, true);
        table.addRow(res);
        return table;
    }

    protected abstract Object reduce(List<Object> cellList);
}
