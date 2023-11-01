package pt.up.fe.els2023.InternalDSL.DSLOutput;

import pt.up.fe.els2023.FileWriter.OutputFileWriter.OutputFileWriter;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLOutput<O extends OutputFileWriter> {
    private final DSLTableBuilder dslTableBuilder;
    private final O output;

    public DSLOutput(DSLTableBuilder dslTableBuilder, O output) {
        this.dslTableBuilder = dslTableBuilder;
        this.output = output;
    }

    public O getOutput() {
        return output;
    }

    public DSLTableBuilder getDslTableBuilder() {
        return dslTableBuilder;
    }

    public void write() {
        output.writeFile();
    }
}
