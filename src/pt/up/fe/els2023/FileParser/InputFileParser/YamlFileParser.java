package pt.up.fe.els2023.FileParser.InputFileParser;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2023.MyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class YamlFileParser implements InputFileParser {
    Map<String, Object> obj;
    File inputFile;

    public YamlFileParser(File inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    public void parse() {

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
    public Map<String, Object> getFlattenedRow() {
        return MyUtils.getFlattenedMap(this.obj, "");
    }
}
