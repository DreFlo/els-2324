package pt.up.fe.els2023.FileParser.InputFileParser;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import pt.up.fe.els2023.FileParser.FileParser;
import pt.up.fe.els2023.Utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static pt.up.fe.els2023.Utils.safelyCastToStringObjectMap;


public abstract class InputFileParser implements FileParser {
    Map<String, Object> obj;
    File inputFile;
    boolean storeFolderName;

    @Override
    public final void parse() {
        obj = getMapFromFile();
        obj.put("filename", inputFile.getName());
        if (storeFolderName) {
            obj.put("folder", inputFile.getParentFile().getName());
        }
    }

    protected abstract Map<String, Object> getMapFromFile();

    public final Map<String, Object> getFlattenedRow() {
        return getFlattenedMapHelper(obj, "");
    }

    private Map<String, Object> getFlattenedMapHelper(Map<String, Object> originalMap, String parentKey){
        Map<String, Object> flattenedMap = new HashMap<>();

        for (Map.Entry<String, Object> entry: originalMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            String columnName = parentKey.equals("") ? key : parentKey + "/" + key;
            if (value instanceof Map<?, ?>) {
                flattenedMap.putAll(getFlattenedMapHelper(safelyCastToStringObjectMap(value), columnName));
            } else {
                flattenedMap.put(columnName, value);
            }

        }

        return flattenedMap;
    }
}
