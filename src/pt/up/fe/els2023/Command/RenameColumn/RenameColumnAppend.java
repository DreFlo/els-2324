package pt.up.fe.els2023.Command.RenameColumn;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;

public class RenameColumnAppend extends RenameColumnByPattern {
    private String append;

    public RenameColumnAppend() {
        this.append = "";
    }

    public RenameColumnAppend(String pattern, String append) {
        super(pattern);
        this.append = append;
    }

    public String getAppend() {
        return append;
    }

    public void setAppend(String append) {
        this.append = append;
    }

    @Override
    protected boolean matches(String header) {
        return header.matches(getPattern());
    }

    @Override
    protected String getNewName(String header) {
        return header + append;
    }
}
