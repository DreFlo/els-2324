package pt.up.fe.els2023;

import pt.up.fe.els2023.Controller.Controller;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new File(args[0]));
        controller.setup();
        controller.run();
    }
}