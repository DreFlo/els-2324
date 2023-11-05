package pt.up.fe.els2023.Utils;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableUtils {
    public static String getExtensionFromFile(File file) {
        String filePath = file.getPath();

        return getExtensionFromPath(filePath);
    }

    public static String getExtensionFromPath(String filePath) {
        String extension = "";
        int index = filePath.lastIndexOf('.');

        if (index > 0) {
            extension = filePath.substring(index + 1);
        }

        return extension;
    }

    public static Map<String, Object> safelyCastToStringObjectMap(Object map) {
        Map<String, Object> safeMap = new HashMap<>();

        assert map instanceof Map<?, ?>;

        for (Map.Entry<?, ?> entry : ((Map<?, ?>) map).entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map<?, ?>) {
                value = safelyCastToStringObjectMap(value);
            } else if (value instanceof List<?> list) {
                if (list.size() > 0 && list.get(0) instanceof Map<?, ?>) {
                    List<Map<String, Object>> newList = new ArrayList<>();
                    for (Object o : list) {
                        newList.add(safelyCastToStringObjectMap(o));
                    }
                    value = newList;
                }
            }
            safeMap.put(key, value);
        }

        return safeMap;
    }

    public static Map<String, Object> generateXMLMap(Element element) {
        Map<String, Object> map = new HashMap<>();

        if (element.getNodeType() == Node.ELEMENT_NODE) {
            if (element.getChildNodes().getLength() == 1 && element.getChildNodes().item(0).getNodeType() == Node.TEXT_NODE)
                map.put(element.getNodeName(), element.getTextContent());
            else {
                map.put(element.getNodeName(), new HashMap<String, Object>());
                for (int i = 0; i < element.getChildNodes().getLength(); i++) {
                    Node node = element.getChildNodes().item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Map<String, Object> childMap = safelyCastToStringObjectMap(map.get(element.getNodeName()));
                        childMap.putAll(generateXMLMap((Element) node));
                        map.put(element.getNodeName(), childMap);
                    }
                    else if (node.getNodeType() == Node.TEXT_NODE) {
                        safelyCastToStringObjectMap(map.get(element.getNodeName())).put(node.getNodeName(), node.getTextContent());
                    }
                }
            }
        }
        return map;
    }


}
