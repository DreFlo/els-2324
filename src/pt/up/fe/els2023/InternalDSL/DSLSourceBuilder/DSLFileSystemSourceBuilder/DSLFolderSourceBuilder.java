package pt.up.fe.els2023.InternalDSL.DSLSourceBuilder.DSLFileSystemSourceBuilder;

import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParserBuilder;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;
import pt.up.fe.els2023.Table.Table;

import java.util.Map;

public class DSLFolderSourceBuilder extends DSLFileSystemSourceBuilder {
    public DSLFolderSourceBuilder(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder);
    }

    @Override
    public DSLTableBuilder end() {
        InputFileParser inputFileParser = InputFileParserBuilder.getInputFileParser(getSource().getPathPattern(), true);
        inputFileParser.parse();
        Map<String, Object> flattenedRow = inputFileParser.getFlattenedRow();

        Table table = getDSLTableBuilder().getTable();

        table.extendTable(flattenedRow);

        return getDSLTableBuilder();
    }
}
