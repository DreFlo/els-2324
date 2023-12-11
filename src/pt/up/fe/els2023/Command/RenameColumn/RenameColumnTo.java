package pt.up.fe.els2023.Command.RenameColumn;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;

public class RenameColumnTo extends RenameColumn {
    String oldName;
    String newName;

    public RenameColumnTo(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
    }

    public RenameColumnTo() {
        this.oldName = "";
        this.newName = "";
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    protected boolean matches(String header) {
        return header.equals(oldName);
    }

    @Override
    protected String getNewName(String header) {
        return newName;
    }
}
