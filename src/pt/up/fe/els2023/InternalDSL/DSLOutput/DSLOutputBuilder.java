package pt.up.fe.els2023.InternalDSL.DSLOutput;

import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;
import pt.up.fe.els2023.InternalDSL.InternalDSLExecutable;

import static pt.up.fe.els2023.Utils.TableUtils.getExtensionFromPath;

public class DSLOutputBuilder implements InternalDSLExecutable {
    DSLTableBuilder dslTableBuilder;
    String path;

    public DSLOutputBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
        this.path = "";
    }

    public DSLTableBuilder getDSLTableBuilder() {
        return dslTableBuilder;
    }

    public DSLTableBuilder outputTo(String path) {
        this.path = path;
        getDSLTableBuilder().addExecutable(this);
        return dslTableBuilder;
    }

    public void execute() throws Exception {
        DSLOutput<?> dslOutput = null;

        switch(getExtensionFromPath(path)) {
            case "csv" -> dslOutput = new DSLCSVOutput(getDSLTableBuilder(), path);
            case "html" -> dslOutput = new DSLHTMLOutput(getDSLTableBuilder(), path);
            default -> throw new IllegalArgumentException("Invalid file extension");
        }

        dslOutput.write();
    }
}
