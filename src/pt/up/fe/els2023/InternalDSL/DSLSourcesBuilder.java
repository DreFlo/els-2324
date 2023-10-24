package pt.up.fe.els2023.InternalDSL;

import pt.up.fe.els2023.Config.Source.FileSource;
import pt.up.fe.els2023.Config.Source.FolderSource;
import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParserBuilder;
import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

enum SourceType {
    FILE,
    FOLDER
}

public class DSLSourcesBuilder {
    private final DSLTableBuilder dslTableBuilder;

    private SourceType type;
    private Source source = null;

    DSLSourcesBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLSourcesBuilder type(String type) {
        switch (type) {
            case "file" -> {source = new FileSource(); this.type = SourceType.FILE;}
            case "folder" -> {source = new FolderSource(); this.type = SourceType.FOLDER;}
        }
        return this;
    }

    public DSLSourcesBuilder path(String path) {
        if (type.equals(SourceType.FILE) || type.equals(SourceType.FOLDER)) {
            this.source.setPathPattern(path);
            return this;
        }
        else throw new RuntimeException("Path only for \"file\" or \"folder\" source types");
    }

    public DSLTableBuilder end() {
        InputFileParser inputFileParser = InputFileParserBuilder.getInputFileParser(source.getPathPattern(), type == SourceType.FOLDER);
        inputFileParser.parse();
        Map<String, Object> flattenedRow = inputFileParser.getFlattenedRow();

        Table table = dslTableBuilder.getTable();

        table.extendTable(flattenedRow);


        return dslTableBuilder;
    }
}
