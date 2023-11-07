package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Filter implements Command {

    List<String> blacklistedColumns;
    List<Class<?>> blacklistedTypes;

    List<String> whitelistedColumns;
    List<Class<?>> whitelistedTypes;

    public Filter() {
        blacklistedColumns = new ArrayList<>();
        blacklistedTypes = new ArrayList<>();
        whitelistedColumns = new ArrayList<>();
        whitelistedTypes = new ArrayList<>();
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

            if (checkStringConditions(header, whitelistedColumns)) {
                continue;
            }

            if (checkStringConditions(header, blacklistedColumns)) {
                columnsToExclude.add(header);
            } else {
                for (List<Object> row : table.getRows()) {
                    if (checkTypeConditions(row.get(i), blacklistedTypes) && !checkTypeConditions(row.get(i), whitelistedTypes)) {
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

    public void addBlacklistedColumn(String condition) {
        blacklistedColumns.add(condition);
    }

    public void addBlacklistedType(Class<?> condition) {
        blacklistedTypes.add(condition);
    }

    public void addWhitelistedColumn(String condition) {
        whitelistedColumns.add(condition);
    }

    public void addWhitelistedType(Class<?> condition) {
        whitelistedTypes.add(condition);
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
