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
    public void parse() {

        Yaml yaml = new Yaml();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(inputFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        obj = yaml.load(inputStream);
        obj.put("filename", inputFile.getName());
        if (storeFolderName) {
            obj.put("folder", inputFile.getParentFile().getName());
        }
    }

    @Override
    public Map<String, Object> getFlattenedRow() {
        return Utils.getFlattenedMap(this.obj, "");
    }
}
