package pt.up.fe.els2023.InputFileParser;

import pt.up.fe.els2023.Utils.TableUtils;

import java.io.File;

public class InputFileParserBuilder {
    public static InputFileParser getInputFileParser(String path, boolean folder){
        File file = new File(path);
        return getInputFileParser(file, folder);
    }

    public static InputFileParser getInputFileParser(File file, boolean folder) {
        String extension = TableUtils.getExtensionFromPath(file.getPath());

        return switch (extension) {
            case "yaml" -> new YamlFileParser(file, folder);
            case "json" -> new JSONFileParser(file, folder);
            case "xml" -> new XMLFileParser(file, folder);
            default -> throw new RuntimeException("Error: " + extension + " file type not configured.");
        };
    }
}
