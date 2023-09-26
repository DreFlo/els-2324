package pt.up.fe.els2023.FileParser.InputFileParser;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2023.Table.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class YamlFileParser implements InputFileParser {
    Map<String, Object> obj;
    public void YamlFileParser() {

    }

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
        System.out.println(obj);

    }

    @Override
    public Row getRow(List<String> headers) {
        return null;
    }
}
