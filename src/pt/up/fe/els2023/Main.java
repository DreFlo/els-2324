package pt.up.fe.els2023;

import pt.up.fe.els2023.Controller.Controller;
import pt.up.fe.els2023.InternalDSL.InternalDSL;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        InternalDSL internalDSL = new InternalDSL();

        internalDSL
                .table()
                        .name("tableName")
                        .source()
                                .type("folder")
                                .path("resources/run[1-2]")
                                .end()
                        .operation()
                                .type("select")
                                .column("filename")
                                .column("params/criterion")
                                .column("params/splitter")
                                .column("params/ccp_alpha")
                                .column("params/min_samples_split")
                                .end();



        Controller controller = new Controller(new File(args[0]));

        controller
                .setup()
                .parseConfigFile()
                .run();
    }
}