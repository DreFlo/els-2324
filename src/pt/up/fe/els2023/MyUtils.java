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
            if (value instanceof Map<?, ?>) {
                flattenedMap.putAll(getFlattenedMap(safelyCastToStringObjectMap((Map<?, ?>) value), columnName));
            } else {
                flattenedMap.put(columnName, value);
            }

        }

        return flattenedMap;
    }

    public static Map<String, Object> safelyCastToStringObjectMap(Map<?, ?> map) {
        Map<String, Object> safeMap = new HashMap<>();

        for (Map.Entry<?, ?> entry : map.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            safeMap.put((String) key, value);
        }

        return safeMap;
    }
}
