package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;

public class RenameColumn implements Command{
    String oldName;
    String newName;

    public RenameColumn() {
    }

    public RenameColumn(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public void setNewName(String newName) {
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
        return new Table(newHeaders, table.getRows());
    }

    @Override
    public String toString() {
        return "RenameColumn{" +
                "oldName='" + oldName + '\'' +
                ", newName='" + newName + '\'' +
                '}';
    }
}
