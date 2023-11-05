package pt.up.fe.els2023;

import pt.up.fe.els2023.InternalDSL.InternalDSL;

import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
        InternalDSL internalDSL = new InternalDSL();

        internalDSL
            .table()
                .name("tableName")
                .source()
                        .folder()
                        .path("resources/run2")
                        .end()
//            .operation()
//                .exclude()
//                    .condition()
//                        .column(".*\\/.*")
//                        .objectType(List.class)
//                    .endCondition()
//                    .whitelist()
//                        .columnName("^params\\/.*")
//                .end()
                .operation()
                .extract()
                .get("name")
                .from("functions")
                .select("max")
                //.sortBy()
                .to("time%")
                .end()
            .operation()
                .squashRows()
                .end()
//                        .operation()
//                                .select()
//                                .column(".*AreaEstimates/Resources/.*")
//                                .end()


            .outputTo("output/DSL.csv");
    }
}