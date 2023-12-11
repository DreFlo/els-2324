package pt.up.fe.els2023;

import pt.up.fe.els2023.InternalDSL.DSLTableExecutor;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        Compiler compiler = new Compiler();

        DSLTableExecutor dslTableExecutor = compiler.parse(Files.readString(Path.of(args[0])));

        dslTableExecutor.execute();
    }
}