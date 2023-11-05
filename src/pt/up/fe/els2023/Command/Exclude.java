package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Exclude implements Command {

    List<String> stringConditions;
    List<Class<?>> typeConditions;

    public Exclude() {
        stringConditions = new ArrayList<>();
        typeConditions = new ArrayList<>();
    }

    @Override
    public Table execute(Table table) {

        List<Integer> columnsToExclude = new ArrayList<>();

        // Check and mark columns to be excluded
        for (int i = 0; i < table.getHeaders().size(); i++) {
            String header = table.getHeaders().get(i);

            if (checkStringConditions(header, stringConditions)) {
                columnsToExclude.add(i);
            } else {
                for (List<Object> row : table.getRows()) {
                    if (checkTypeConditions(row.get(i), typeConditions)) {
                        columnsToExclude.add(i);
                        break;
                    }
                }
            }
        }

        // Remove columns marked for exclusion
        for (int i = columnsToExclude.size() - 1; i >= 0; i--) {
            int columnIndex = columnsToExclude.get(i);
            System.out.println("Will exclude following index: " + columnIndex);
            table.getHeaders().remove(columnIndex);
            for (List<Object> row : table.getRows()) {
                row.remove(columnIndex);
            }
        }

        return table;
    }

    public void addCondition(String condition) {
        stringConditions.add(condition);
    }

    public void addCondition(Class<?> condition) {
        typeConditions.add(condition);
    }

    private static boolean checkStringConditions(String header, List<String> stringConditions) {
        System.out.println("Checking following string conditions: " + stringConditions);

        for (String condition : stringConditions) {
            if (Pattern.matches(condition, header)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkTypeConditions(Object instance, List<Class<?>> typeConditions) {
        for (Class<?> condition : typeConditions) {
            if (condition.isInstance(instance)) {
                return true;
            }
        }
        return false;
    }
}
