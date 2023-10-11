package pt.up.fe.els2023.Config.Source;

import java.util.Map;

public class SourceBuilder {
    public static Source getSource(String type, Map<?, ?> params) throws IllegalArgumentException{
        return switch (type) {
            case "file" -> new FileSource((String) params.get("path"));
            case "folder" -> new FolderSource((String) params.get("path"));
            default -> throw new IllegalArgumentException("Invalid source type");
        };
    }
}
