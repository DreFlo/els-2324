package pt.up.fe.els2023.InternalDSL.DSLOutput;

import pt.up.fe.els2023.FileWriter.OutputFileWriter.HtmlFileWriter;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLHTMLOutput extends DSLOutput<HtmlFileWriter> {
    public DSLHTMLOutput(DSLTableBuilder dslTableBuilder, String output) {
        super(dslTableBuilder, new HtmlFileWriter(dslTableBuilder.getTable(), output));
    }
}
