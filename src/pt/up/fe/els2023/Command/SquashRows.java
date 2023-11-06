package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SquashRows implements Command {
    @Override
    public Table execute(Table table) {
        List<List<Object>> newRows = new ArrayList<>();
        int folderIndex = table.getHeaders().indexOf("0__folder");

        if (folderIndex == -1) {
            return table;
        }

        Map<String, List<List<Object>>> groupByFolder = table.getRows().stream().collect(Collectors.groupingBy(row -> {
            if (row.get(folderIndex) == null) {
                return "";
            }
            return (String) row.get(folderIndex);
        }));

        for (String folder: groupByFolder.keySet()) {
            List<List<Object>> rows = groupByFolder.get(folder);
            if (folder.isEmpty()) {
                newRows.addAll(rows);
            }
            else {
                List<Object> newRow = new ArrayList<>();
                for (int i = 0; i < table.getHeaders().size(); i++) {
                    newRow.add(i , null);
                    for (List<Object> row : rows) {
                        if (row.get(i) != null) {
                            newRow.set(i, row.get(i));
                            break;
                        }
                    }
                }
                newRows.add(newRow);
            }
        }

        Table newTable = new Table(table.getName(), table.getHeaders(), newRows);

        newTable.removeColumn("0__filename");

        return newTable;
    }
}
