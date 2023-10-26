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
                                .path("resources/run[1-2]")
                                .end()
                        .source()
                                .file()
                                .path("resources/run3.csv")
                                .end()
                        .operation()
                                .select()
                                .column("filename")
                                .column("params/criterion")
                                .column("params/splitter")
                                .column("params/ccp_alpha")
                                .column("params/min_samples_split")
                                .end()
                        .operation()
                                .renameColumn()
                                .from("foo")
                                .to("bar")
                                .end()
                        .operation()
                                .squashRows()
                                .end();



        Controller controller = new Controller(new File(args[0]));

        controller
                .setup()
                .parseConfigFile()
                .run();
    }
}