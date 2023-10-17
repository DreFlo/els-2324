package pt.up.fe.els2023.FileParser.InputFileParser;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2023.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class YamlFileParser extends InputFileParser {

    public YamlFileParser(File inputFile, boolean storeFolderName) {
        this.inputFile = inputFile;
        this.storeFolderName = storeFolderName;
    }

    @Override
    protected Map<String, Object> getMapFromFile() {
        Yaml yaml = new Yaml();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(inputFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return yaml.load(inputStream);
    }
}
