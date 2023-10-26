package pt.up.fe.els2023.InternalDSL.DSLSourceBuilder.DSLFileSystemSourceBuilder;

import pt.up.fe.els2023.InternalDSL.DSLSourceBuilder.DSLSourceBuilder;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public abstract class DSLFileSystemSourceBuilder extends DSLSourceBuilder {
    public DSLFileSystemSourceBuilder(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder);
    }

    public DSLFileSystemSourceBuilder path(String path) {
        getSource().setPathPattern(path);
        return this;
    }
}
