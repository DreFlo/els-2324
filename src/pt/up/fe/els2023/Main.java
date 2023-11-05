package pt.up.fe.els2023;

import pt.up.fe.els2023.InternalDSL.InternalDSL;
import pt.up.fe.els2023.Utils.Comparators;
import pt.up.fe.els2023.Utils.Selectors;

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
                .operation()
                    .squashRows()
                    .end()
                .operation()
                    .extract()
                        .from("functions")
                        .select(Selectors.MAX)
                        .sortBy(Comparators.TIME_PERCENTAGE)
                        .get("name")
                    .end()
            .operation()
                .exclude()
                    .blacklist()
                        .column(".*\\/.*")
                        .objectType(List.class)
                    .end()
//                    .whitelist()
//                        .columnName("^params\\/.*")
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