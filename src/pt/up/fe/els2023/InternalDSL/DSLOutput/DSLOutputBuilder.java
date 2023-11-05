package pt.up.fe.els2023.InternalDSL.DSLOutput;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import static pt.up.fe.els2023.Utils.TableUtils.getExtensionFromPath;

public class DSLOutputBuilder {
    DSLTableBuilder dslTableBuilder;

    public DSLOutputBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLTableBuilder getDSLTableBuilder() {
        return dslTableBuilder;
    }

    public DSLTableBuilder outputTo(String path) {
        DSLOutput dslOutput = null;

        switch(getExtensionFromPath(path)) {
            case "csv" -> dslOutput = new DSLCSVOutput(getDSLTableBuilder(), path);
            case "html" -> dslOutput = new DSLHTMLOutput(getDSLTableBuilder(), path);
            default -> throw new IllegalArgumentException("Invalid file extension");
        }

        dslOutput.write();

        return dslTableBuilder;
    }
}
