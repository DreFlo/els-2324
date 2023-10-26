package pt.up.fe.els2023.InternalDSL.DSLSourceBuilder;

import pt.up.fe.els2023.Config.Source.FileSource;
import pt.up.fe.els2023.Config.Source.FolderSource;
import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.InternalDSL.DSLSourceBuilder.DSLFileSystemSourceBuilder.DSLFileSourceBuilder;
import pt.up.fe.els2023.InternalDSL.DSLSourceBuilder.DSLFileSystemSourceBuilder.DSLFolderSourceBuilder;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLSourceBuilder {
    private final DSLTableBuilder dslTableBuilder;

    private Source source = null;

    public DSLSourceBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLTableBuilder getDSLTableBuilder() {
        return dslTableBuilder;
    }

    public Source getSource() {
        return source;
    }

    public final DSLFileSourceBuilder file() {
        this.source = new FileSource();
        return (DSLFileSourceBuilder) this;
    }

    public final DSLFolderSourceBuilder folder() {
        this.source = new FolderSource();
        return (DSLFolderSourceBuilder) this;
    }

    public DSLTableBuilder end() {
        return dslTableBuilder;
    }
}
