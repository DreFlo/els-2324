package pt.up.fe.els2023.InternalDSL.DSLSource;

import pt.up.fe.els2023.InternalDSL.DSLSource.DSLFileSystemSource.DSLFileSource;
import pt.up.fe.els2023.InternalDSL.DSLSource.DSLFileSystemSource.DSLFolderSource;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLSourceBuilder {
    private final DSLTableBuilder dslTableBuilder;

    public DSLSourceBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLTableBuilder getDSLTableBuilder() {
        return dslTableBuilder;
    }

    public final DSLFileSource file() {
        return new DSLFileSource(dslTableBuilder);
    }

    public final DSLFolderSource folder() {
        return new DSLFolderSource(dslTableBuilder);
    }

    public DSLTableBuilder end() {
        return dslTableBuilder;
    }
}
