package pt.up.fe.els2023.InternalDSL.DSLSource.DSLFileSystemSource;

import pt.up.fe.els2023.Config.Source.FileSystemSource.FolderSource;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLFolderSource extends DSLFileSystemSource<FolderSource> {
    public DSLFolderSource(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new FolderSource(), false);
    }
}
