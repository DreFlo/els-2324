package pt.up.fe.els2023.InternalDSL.DSLSource.DSLFileSystemSource;

import pt.up.fe.els2023.Config.Source.FileSystemSource.FileSystemSource;
import pt.up.fe.els2023.FileMatcher;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParserBuilder;
import pt.up.fe.els2023.InternalDSL.DSLSource.DSLSource;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class DSLFileSystemSource<FSS extends FileSystemSource> extends DSLSource<FSS> {
    private final boolean isFolder;

    public DSLFileSystemSource(DSLTableBuilder dslTableBuilder, FSS source, boolean isFolder) {
        super(dslTableBuilder, source);
        this.isFolder = isFolder;
    }

    public DSLFileSystemSource<FSS> path(String path) {
        getSource().setPathPattern(path);
        return this;
    }

    public boolean isFolder() {
        return isFolder;
    }

    @Override
    protected final List<Map<String, Object>> getTableRows() {
        List<Map<String, Object>> flattenedRows = new ArrayList<>();
        List<File> files = FileMatcher.matchedFiles(getSource());

        assert files != null;

        for (File file : files) {
            InputFileParser inputFileParser = InputFileParserBuilder.getInputFileParser(file.getAbsolutePath(), isFolder());
            inputFileParser.parse();
            System.out.println(inputFileParser.getFlattenedRow());
            Map<String, Object> flattenedRow = inputFileParser.getFlattenedRow();
            flattenedRows.add(flattenedRow);
        }

        return flattenedRows;
    }
}
