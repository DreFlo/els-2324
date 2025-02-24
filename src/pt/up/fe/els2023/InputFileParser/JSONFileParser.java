package pt.up.fe.els2023.InputFileParser;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import pt.up.fe.els2023.Utils.TableUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class JSONFileParser extends InputFileParser {
    public JSONFileParser(File inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    protected Map<String, Object> getMapFromFile() {
        try {
            return TableUtils.safelyCastToStringObjectMap(new JSONParser().parse(new FileReader(inputFile)));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
