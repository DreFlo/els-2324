package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RenameColumn implements Command{
    String oldName;
    String newName;
    String prefix;
    String suffix;

    public RenameColumn() {
    }

    public RenameColumn(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
        this.prefix = null;
        this.suffix = null;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public Table execute(Table table) {
        List<String> newHeaders = new ArrayList<>();
        for (String oldHeader : table.getHeaders()) {
            if (oldHeader.equals(oldName))
                newHeaders.add(newName);
            else {
                if (prefix != null && prefix.length() > 0) {
                    if (oldHeader.matches(oldName))
                        oldHeader = prefix + oldHeader;
                }
                if (suffix != null && suffix.length() > 0) {
                    if (oldHeader.matches(oldName))
                        oldHeader = oldHeader + suffix;  
                }
                newHeaders.add(oldHeader);
            }
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
