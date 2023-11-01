package pt.up.fe.els2023.Config.Source.FileSystemSource;

import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParser;
import pt.up.fe.els2023.FileParser.InputFileParser.InputFileParserBuilder;

import java.util.Map;

public class FolderSource extends FileSystemSource {

    public FolderSource() {
        super();
    }

    public FolderSource(String pathPattern) {
        super(pathPattern);
    }

    @Override
    public String toString() {
        return "FolderSource{" +
                "pathPattern='" + getPathPattern() + '\'' +
                '}';
    }
}
