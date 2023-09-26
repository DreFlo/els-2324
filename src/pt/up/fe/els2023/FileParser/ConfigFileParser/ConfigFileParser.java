package pt.up.fe.els2023.FileParser.ConfigFileParser;

import pt.up.fe.els2023.FileParser.FileParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class ConfigFileParser implements FileParser {

    ConfigFileParser(String configFilePath) {
        File configFile = new File(configFilePath);
    }

    @Override
    public void parse(File inputFile) {
        try {
            Object obj = new JSONParser().parse(new FileReader(inputFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    
}
