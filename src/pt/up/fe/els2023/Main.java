package pt.up.fe.els2023;

import pt.up.fe.els2023.InternalDSL.DSLTableExecutor;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        Parser parser = new Parser();

        DSLTableExecutor dslTableExecutor = parser.parse(Files.readString(Path.of(args[0])));

        dslTableExecutor.execute();
    }
}