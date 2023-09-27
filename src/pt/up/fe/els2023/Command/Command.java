package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

public interface Command {
    Table execute(Table table);
}
