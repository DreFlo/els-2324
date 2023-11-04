package pt.up.fe.els2023;

import pt.up.fe.els2023.InternalDSL.InternalDSL;



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
                .exclude()
                    .condition()
                        .column(".*\\/.*")
                        .fileType(Integer.class)
                    .endCondition()
//                    .whitelist()
//                        .columnName("^params\\/.*")
                .end()
            .operation()
                .extract()
                    .sourceColumn("sourceColumn")
                    .function("max")
                    .sort()
                    .targetColumn()
                        .column("column1")
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