package pt.up.fe.els2023.InputFileParser;

import pt.up.fe.els2023.Utils.FileParser;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static pt.up.fe.els2023.Utils.TableUtils.safelyCastToStringObjectMap;


public abstract class InputFileParser implements FileParser {
    Map<String, Object> obj;
    File inputFile;

    @Override
    public final void parse() {
        obj = getMapFromFile();
        obj.put("0__filename", inputFile.getName());
        obj.put("0__folder", inputFile.getParentFile().getName());
    }

    protected abstract Map<String, Object> getMapFromFile();

    public final Map<String, Object> getFlattenedRow() {
        return getFlattenedMapHelper(obj, inputFile.getName());
    }

    private Map<String, Object> getFlattenedMapHelper(Map<String, Object> originalMap, String parentKey){
        Map<String, Object> flattenedMap = new HashMap<>();

        for (Map.Entry<String, Object> entry: originalMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            String columnName = parentKey.isEmpty() ? key : parentKey + "/" + key;
            if (value instanceof Map<?, ?>) {
                flattenedMap.putAll(getFlattenedMapHelper(safelyCastToStringObjectMap(value), columnName));
            } else {
                flattenedMap.put(columnName, value);
            }

        }

        return flattenedMap;
    }
}
