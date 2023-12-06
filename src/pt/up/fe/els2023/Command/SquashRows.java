package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SquashRows implements Command {
    private final List<String> squashHeaders;

    public SquashRows() {
        this.squashHeaders = new ArrayList<>();
    }

    public SquashRows(List<String> squashHeaders) {
        this.squashHeaders = squashHeaders;
    }

    public void addSquashHeader(String header) {
        if (!this.squashHeaders.contains(header))
            this.squashHeaders.add(header);
    }

    private Table squash(Table table, String header) {
        List<List<Object>> newRows = new ArrayList<>();
        int headerIndex = table.getHeaders().indexOf(header);

        if (headerIndex == -1) {
            return table;
        }

        Map<String, List<List<Object>>> groupByFolder = table.getRows().stream().collect(Collectors.groupingBy(row -> {
            if (row.get(headerIndex) == null) {
                return "";
            }
            return (String) row.get(headerIndex);
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

        Table newTable = new Table(table.getHeaders(), newRows);

        newTable.removeColumn("0__filename");

        return newTable;
    }

    @Override
    public Table execute(Table table) throws Exception {
        Table newTable = table;
        for (String header: squashHeaders) {
            newTable = squash(newTable, header);
        }
        return newTable;
    }
}
