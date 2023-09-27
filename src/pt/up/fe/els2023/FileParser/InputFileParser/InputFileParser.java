package pt.up.fe.els2023.FileParser.InputFileParser;

import pt.up.fe.els2023.FileParser.FileParser;

import java.util.Map;


public interface InputFileParser extends FileParser {
    public Map<String, Object> getFlattenedRow();
}
