package pt.up.fe.els2023.FileParser.InputFileParser;

import pt.up.fe.els2023.FileParser.FileParser;

import java.io.File;
import java.util.Map;


public abstract class InputFileParser implements FileParser {
    Map<String, Object> obj;
    File inputFile;
    boolean storeFolderName;

    public abstract Map<String, Object> getFlattenedRow();
}
