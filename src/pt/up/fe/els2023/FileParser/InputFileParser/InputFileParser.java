package pt.up.fe.els2023.FileParser.InputFileParser;

import pt.up.fe.els2023.FileParser.FileParser;
import pt.up.fe.els2023.Table.Row;

import java.util.List;

public interface InputFileParser extends FileParser {

    // TODO Probably going to need args for columns to retrieve
    Row getRow(List<String> headers);
}
