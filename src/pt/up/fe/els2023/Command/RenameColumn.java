package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;

public class RenameColumn implements Command{
    String oldName;
    String newName;

    public RenameColumn(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
    }

    @Override
    public Table execute(Table table) {
        List<String> newHeaders = new ArrayList<>();
        for (String oldHeader : table.getHeaders()) {
            if (oldHeader.equals(oldName))
                newHeaders.add(newName);
            else
                newHeaders.add(oldHeader);
        }
        Table newTable = new Table(table.getName(), newHeaders);
        newTable.addRows(table.getRows());
        return newTable;
    }

    @Override
    public String toString() {
        return "RenameColumn{" +
                "oldName='" + oldName + '\'' +
                ", newName='" + newName + '\'' +
                '}';
    }
}
