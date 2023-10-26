package pt.up.fe.els2023.InternalDSL.DSLSourceBuilder.DSLFileSystemSourceBuilder;

import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParserBuilder;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;
import pt.up.fe.els2023.Table.Table;

import java.util.Map;

public class DSLFileSourceBuilder extends DSLFileSystemSourceBuilder {
    public DSLFileSourceBuilder(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder);
    }

    @Override
    public DSLTableBuilder end() {
        InputFileParser inputFileParser = InputFileParserBuilder.getInputFileParser(getSource().getPathPattern(), false);
        inputFileParser.parse();
        Map<String, Object> flattenedRow = inputFileParser.getFlattenedRow();

        Table table = getDSLTableBuilder().getTable();

        table.extendTable(flattenedRow);

        return getDSLTableBuilder();
    }
}
