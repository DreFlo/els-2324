package pt.up.fe.els2023.InternalDSL.DSLSource.DSLFileSystemSource;

import pt.up.fe.els2023.Config.Source.FileSystemSource.FileSystemSource;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParserBuilder;
import pt.up.fe.els2023.InternalDSL.DSLSource.DSLSource;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.util.Map;

public abstract class DSLFileSystemSource<FSS extends FileSystemSource> extends DSLSource<FSS> {
    private final boolean isFile;

    public DSLFileSystemSource(DSLTableBuilder dslTableBuilder, FSS source, boolean isFile) {
        super(dslTableBuilder, source);
        this.isFile = isFile;
    }

    public DSLFileSystemSource<FSS> path(String path) {
        getSource().setPathPattern(path);
        return this;
    }

    public boolean isFile() {
        return isFile;
    }

    @Override
    protected final Map<String, Object> getFlattenedRow() {
        InputFileParser inputFileParser = InputFileParserBuilder.getInputFileParser(getSource().getPathPattern(), !isFile());
        inputFileParser.parse();
        return inputFileParser.getFlattenedRow();
    }
}
