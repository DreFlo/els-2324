package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Filter implements Command {

    List<String> denylistedColumns;
    List<Class<?>> denylistedTypes;

    List<String> exceptlistedColumns;
    List<Class<?>> exceptlistedTypes;

    public Filter() {
        denylistedColumns = new ArrayList<>();
        denylistedTypes = new ArrayList<>();
        exceptlistedColumns = new ArrayList<>();
        exceptlistedTypes = new ArrayList<>();
    }

    @Override
    public Table execute(Table table) {

        List<String> columnsToExclude = new ArrayList<>();

        // Check and mark columns to be excluded
        for (int i = 0; i < table.getHeaders().size(); i++) {
            String header = table.getHeaders().get(i);

            if (header.startsWith("0__")) {
                continue;
            }

            if (checkStringConditions(header, exceptlistedColumns)) {
                continue;
            }

            if (checkStringConditions(header, denylistedColumns)) {
                columnsToExclude.add(header);
            } else {
                for (List<Object> row : table.getRows()) {
                    if (checkTypeConditions(row.get(i), denylistedTypes) && !checkTypeConditions(row.get(i), exceptlistedTypes)) {
                        columnsToExclude.add(header);
                        break;
                    }
                }
            }
        }

        for (String column : columnsToExclude) {
            table.removeColumn(column);
        }

        return table;
    }

    public void addDenylistedColumn(String condition) {
        denylistedColumns.add(condition);
    }

    public void addDenylistedType(Class<?> condition) {
        denylistedTypes.add(condition);
    }

    public void addExceptlistedColumn(String condition) {
        exceptlistedColumns.add(condition);
    }

    public void addExceptlistedType(Class<?> condition) {
        exceptlistedTypes.add(condition);
    }

    private static boolean checkStringConditions(String header, List<String> stringConditions) {
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
