package pt.up.fe.els2023.TableManipulator;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Table.Table;

import java.util.List;

// TODO Imagino que iremos necessitar de um SingleTableManipulator e um MultipleTableManipulator depois
public class TableManipulator {
    List<Command> commands;

    public TableManipulator(List<Command> commands) {
        this.commands = commands;
    };

    public Table applyOperations(Table table) {
        Table resultTable = table;
        for (Command command : commands) {
            resultTable = command.execute(resultTable);
        }
        return resultTable;
    }
}
