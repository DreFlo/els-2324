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
                                .folder()
                                .path("resources/run2")
                                .end()
                        .operation()
                            .squashRows()
                            .end()
//                        .operation()
//                                .select()
//                                .column(".*AreaEstimates/Resources/.*")
//                                .end()
                        .outputTo("output/DSL.csv");

//        Controller controller = new Controller(new File(args[0]));
//
//        controller
//                .setup()
//                .parseConfigFile()
//                .run();
    }
}