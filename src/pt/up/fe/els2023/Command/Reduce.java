package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Reduce implements Command{
    Function<List<?>, Object> function;
    Class<?> objectType;


    public Reduce() {
        function = null;
        objectType = null;
    }


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

        List<List<Object>> tableRows = table.getRows();
        if (tableRows.isEmpty()) return table;

        List<Object> firstRow = tableRows.get(tableRows.size()-1);
        List<Object> res = new ArrayList<>();

        for (int i = 0; i < firstRow.size(); i++) {
            Object rowRes = null;
            if(firstRow.get(i) != null) {
                System.out.println(firstRow.get(i).getClass() + " " + objectType);
            }
            if (firstRow.get(i) != null && firstRow.get(i).getClass() == objectType) {
                List<Object> list = new ArrayList<>();

                for (List<Object> obj : tableRows) {
                    list.add(obj.get(i));
                }

                rowRes = function.apply(list);

            }
            res.add(rowRes);
        }

        table.addRow(res);

        return table;
    }
}
