package pt.up.fe.els2023.Command.RenameColumn;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class RenameColumn implements Command {
    public RenameColumn() {}

    @Override
    public final Table execute(Table table) {
        List<String> newHeaders = new ArrayList<>();
        for (String oldHeader : table.getHeaders()) {
            if (matches(oldHeader))
                newHeaders.add(getNewName(oldHeader));
            else {
                newHeaders.add(oldHeader);
            }
        }
        return new Table(newHeaders, table.getRows());
    }

    protected abstract boolean matches(String header);

    protected abstract String getNewName(String header);
}
