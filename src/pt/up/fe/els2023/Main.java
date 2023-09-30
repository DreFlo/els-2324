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
}