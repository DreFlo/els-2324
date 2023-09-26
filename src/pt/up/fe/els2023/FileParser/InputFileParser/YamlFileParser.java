package pt.up.fe.els2023.FileParser.InputFileParser;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2023.Table.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YamlFileParser implements InputFileParser {
    Map<String, Object> obj;

    public YamlFileParser() {}

    @Override
    public void parse(File inputFile) {

        Yaml yaml = new Yaml();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(inputFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        obj = yaml.load(inputStream);

    }

    @Override
    public List<Object> getRow(List<String> headers) {
        List<Object> res = new ArrayList<>();

        for (String header: headers) { // "params", "criterion"
            res.add(getValue(this.obj, header.split("/")));
        }

        return res;
    }

    private <T> T getValue(Map map, String[] keys) {
        Object value = map;

        for (String key: keys) {
            value = ((Map) value).get(key);
        }

        return (T) value;
    }
}
