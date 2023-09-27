package pt.up.fe.els2023;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Command.RenameColumn;
import pt.up.fe.els2023.Command.Select;
import pt.up.fe.els2023.Controller.Controller;
import pt.up.fe.els2023.Table.Table;
import pt.up.fe.els2023.TableManipulator.TableManipulator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new File(args[0]));
        controller.setup();
        controller.run();
    }

    public static void tableManipulatorTestMain(String[] args) {
        Table table = new Table(new ArrayList<>(Arrays.asList("A", "B", "C")));
        table.addRow(new ArrayList<>(Arrays.asList(1, 2, 3)));

        System.out.println(table);

        List<Command> commands = new ArrayList<>(Arrays.asList(new Select(Arrays.asList("A", "B")), new RenameColumn("B", "D")));

        TableManipulator tableManipulator = new TableManipulator(commands);

        Table newTable = tableManipulator.applyOperations(table);

        System.out.println(newTable);
    }
}