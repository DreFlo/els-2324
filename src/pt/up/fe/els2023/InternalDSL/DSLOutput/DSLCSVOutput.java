package pt.up.fe.els2023.InternalDSL.DSLOutput;

import pt.up.fe.els2023.FileWriter.OutputFileWriter.CsvFileWriter;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLCSVOutput extends DSLOutput<CsvFileWriter>{
    public DSLCSVOutput(DSLTableBuilder dslTableBuilder, String output) {
        super(dslTableBuilder, new CsvFileWriter(dslTableBuilder.getTable(), output));
    }
}
