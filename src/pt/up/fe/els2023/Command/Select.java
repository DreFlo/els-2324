package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;

public class Select implements Command {
    private final List<String> selectedHeaderPatterns;

    public Select() {
        this.selectedHeaderPatterns = new ArrayList<>();
    }

    public Select(List<String> selectedHeaders) {
        this.selectedHeaderPatterns = selectedHeaders;
    }

    @Override
    public Table execute(Table table) {
        List<Integer> selectedHeaderIndices = new ArrayList<>();

        List<String> selectedHeaders = getSelectedHeaders(table);

        // Get selected header indices in original table
        for (String selectedHeader : selectedHeaders) {
            Integer selectedHeaderIndex = table.getHeaders().indexOf(selectedHeader);
            selectedHeaderIndices.add(selectedHeaderIndex);
        }

        Table newTable = new Table(selectedHeaders);

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

    public void addHeaderPattern(String header) {
        if (!this.selectedHeaderPatterns.contains(header))
            this.selectedHeaderPatterns.add(header);
    }


    public List<String> getSelectedHeaders(Table table) {
        List<String> selectedHeaders = new ArrayList<>();
        for (String selectedHeaderPattern : selectedHeaderPatterns) {
            for (String header : table.getHeaders()) {
                if (header.matches(selectedHeaderPattern)) {
                    selectedHeaders.add(header);
                }
            }
        }
        return selectedHeaders;
    }

    @Override
    public String toString() {
        return "Select{" +
                "selected=" + selectedHeaderPatterns +
                '}';
    }
}
