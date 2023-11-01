package pt.up.fe.els2023.InternalDSL.DSLSource.DSLFileSystemSource;

import pt.up.fe.els2023.Config.Source.FileSystemSource.FileSource;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.util.Map;

public class DSLFileSource extends DSLFileSystemSource<FileSource> {
    public DSLFileSource(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new FileSource(), true);
    }
}
