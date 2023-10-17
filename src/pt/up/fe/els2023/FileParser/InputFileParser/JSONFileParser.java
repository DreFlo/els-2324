package pt.up.fe.els2023.FileParser.InputFileParser;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import pt.up.fe.els2023.Utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JSONFileParser extends InputFileParser {
    public JSONFileParser(File inputFile, boolean storeFolderName) {
        this.inputFile = inputFile;
        this.storeFolderName = storeFolderName;
    }

    @Override
    public Map<String, Object> getFlattenedRow() {
        return Utils.getFlattenedMap(this.obj, "");
    }

    private Map<String, Object> safeCast(Object obj) {
        Map<String, Object> map = new HashMap<>();
        for (Map.Entry<?, ?> entry : ((Map<?, ?>) obj).entrySet()) {
            map.put((String) entry.getKey(), entry.getValue());
        }
        return map;
    }

    @Override
    public void parse() {
        // TODO Fix cast
        try {
            obj = safeCast(new JSONParser().parse(new FileReader(inputFile)));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        obj.put("filename", inputFile.getName());
        if (storeFolderName) {
            obj.put("folder", inputFile.getParentFile().getName());
        }
    }
}
