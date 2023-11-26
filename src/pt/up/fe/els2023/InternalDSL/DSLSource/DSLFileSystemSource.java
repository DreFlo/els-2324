package pt.up.fe.els2023.InternalDSL.DSLSource;

import pt.up.fe.els2023.Config.Source.FileSystemSource;
import pt.up.fe.els2023.CustomExceptions.NotDirectoryNorFileException;
import pt.up.fe.els2023.FileMatcher;
import pt.up.fe.els2023.InputFileParser.InputFileParser;
import pt.up.fe.els2023.InputFileParser.InputFileParserBuilder;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DSLFileSystemSource extends DSLSource<FileSystemSource> {
    public DSLFileSystemSource(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new FileSystemSource());
    }

    public DSLFileSystemSource path(String path) {
        getSource().setPathPattern(path);
        return this;
    }

    @Override
    protected final List<Map<String, Object>> getTableRows() throws NotDirectoryNorFileException {
        List<Map<String, Object>> flattenedRows = new ArrayList<>();
        List<File> files = FileMatcher.matchedFiles(getSource());

        for (File file : files) {
            InputFileParser inputFileParser = InputFileParserBuilder.getInputFileParser(file.getAbsolutePath());
            inputFileParser.parse();
            Map<String, Object> flattenedRow = inputFileParser.getFlattenedRow();
            flattenedRows.add(flattenedRow);
        }

        return flattenedRows;
    }
}
