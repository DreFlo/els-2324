package pt.up.fe.els2023.InputFileParser;

import pt.up.fe.els2023.Utils.TableUtils;

import java.io.File;

public class InputFileParserBuilder {
    public static InputFileParser getInputFileParser(String path){
        File file = new File(path);
        return getInputFileParser(file);
    }

    public static InputFileParser getInputFileParser(File file) {
        String extension = TableUtils.getExtensionFromPath(file.getPath());

        return switch (extension) {
            case "yaml" -> new YamlFileParser(file);
            case "json" -> new JSONFileParser(file);
            case "xml" -> new XMLFileParser(file);
            default -> throw new RuntimeException("Error: " + extension + " file type not configured.");
        };
    }
}
