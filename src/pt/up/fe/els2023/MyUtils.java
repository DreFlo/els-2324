package pt.up.fe.els2023;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MyUtils {
    public static String getExtensionFromFile(File file) {
        String extension = "";
        String filePath = file.getPath();

        int index = filePath.lastIndexOf('.');
        if (index > 0) {
            extension = filePath.substring(index + 1);
        }

        return extension;
    }

    public static Map<String, Object> getFlattenedMap(Map<String, Object> originalMap, String parentKey) {
        Map<String, Object> flattenedMap = new HashMap<>();

        for (Map.Entry<String, Object> entry: originalMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            String columnName = parentKey.equals("") ? key : parentKey + "/" + key;
            if (value instanceof Map) {
                // TODO Fix casting
                flattenedMap.putAll(getFlattenedMap((Map<String, Object>) value, columnName));
            } else {
                flattenedMap.put(columnName, value);
            }

        }

        return flattenedMap;
    }
}
