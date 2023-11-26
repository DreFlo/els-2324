package pt.up.fe.els2023.InputFileParser;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class YamlFileParser extends InputFileParser {

    public YamlFileParser(File inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    protected Map<String, Object> getMapFromFile() {
        Yaml yaml = new Yaml();
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(inputFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return yaml.load(inputStream);
    }
}
