package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;

public class Select implements Command {
    List<String> selectedHeaders;

    public Select() {
        this.selectedHeaders = new ArrayList<>();
    }

    public Select(List<String> selectedHeaders) {
        this.selectedHeaders = selectedHeaders;
    }

    @Override
    public Table execute(Table table) {
        List<Integer> selectedHeaderIndices = new ArrayList<>();
        // Get selected header indices in original table
        for (String selectedHeader : selectedHeaders) {
            Integer selectedHeaderIndex = table.getHeaders().indexOf(selectedHeader);
            selectedHeaderIndices.add(selectedHeaderIndex);
        }

        Table newTable = new Table(table.getName(), selectedHeaders);

        // Get rows
        for (List<Object> row : table.getRows()) {
            List<Object> newRow = new ArrayList<>();

            for (Integer index : selectedHeaderIndices) {
                newRow.add(row.get(index));
            }

            newTable.addRow(newRow);
        }

        return newTable;
    }

    public void addHeader(String header) {
        if (!this.selectedHeaders.contains(header))
            this.selectedHeaders.add(header);
    }

    @Override
    public String toString() {
        return "Select{" +
                "selected=" + selectedHeaders +
                '}';
    }
}
