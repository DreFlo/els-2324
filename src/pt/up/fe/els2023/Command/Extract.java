package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.*;

public class Extract implements Command{
    String getColumn;
    String sourceColumn;
    String function;
    String sort;
    String targetColumn;

    public Extract() {
        this.sort = "default";
    }

    @Override
    public Table execute(Table table) throws Exception {
        System.out.println("\n\n\n\n" + table.toString());


        List<String> headers = table.getHeaders();
        if (!headers.contains(sourceColumn)) {
            throw new Exception(sourceColumn + " is not a column from the table");
        }

        List<Object> values = table.getValueFromHeader(sourceColumn);
        List<Map<String, Number>> objects = new ArrayList<>();

        for (Object value : values) {
            if (value instanceof List) {
                for (Object obj : (List<?>) value) {
                    if (obj instanceof Map) {
                        objects.add((Map<String, Number>) obj);
                    }
                }
            }
        }

        System.out.println(objects);
        objects.sort(Comparator.comparingDouble(o -> (double) o.get(targetColumn)));

        // TODO: try to pass the function. I tried already, not a success
        Map<String, Number> value = null;
        switch (function.toLowerCase()) {
            case "max":
                value = objects.get(objects.size()-1);
                break;
            case "min":
                value = objects.get(0);
                break;
            case "median":
                value = objects.get(objects.size()/2);
                break;
            default:
                System.out.println(function + " not implemented.");
        }

        // TODO: acho impossivel fazer o que stor quer apenas com uma table.
        // O que eu fiz foi extender a table que temos para ter mais uma coluna com novos valores

        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < objects.size(); i++) {
            map.put(function + targetColumn, value.get(getColumn));
        }
        table.extendTable(map);

        return table;
    }

    public void setGetColumn(String getColumn) {
        this.getColumn = getColumn;
    }

    public void setSourceColumn(String sourceColumn) {
        this.sourceColumn = sourceColumn;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setTargetColumn(String targetColumn) {
        this.targetColumn = targetColumn;
    }
}
