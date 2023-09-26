package pt.up.fe.els2023.FileParser.ConfigFileParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Command.RenameColumn;
import pt.up.fe.els2023.Command.Select;
import pt.up.fe.els2023.Config.Source.FileSource;
import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.Config.TableConfig;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.*;

public class JSONConfigFileParser implements ConfigFileParser {
    JSONObject jsonObject = null;

    public JSONConfigFileParser() {
    }

    public static void main(String[] args) {
        JSONConfigFileParser jsonConfigFileParser = new JSONConfigFileParser();
    }

    @Override
    public void parse(File inputFile) {
        try {
            jsonObject = (JSONObject) new JSONParser().parse(new FileReader(inputFile));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<TableConfig> getConfigurationFiles() throws RuntimeException {
        if (jsonObject == null) {
            throw new RuntimeException("No JSON was Parsed");
        }

        if (!jsonObject.containsKey("tables")) {
            throw new RuntimeException("JSON missing \"tables\"");
        }

        JSONArray tables = (JSONArray) jsonObject.get("tables");

        List<TableConfig> tableConfigs = new ArrayList<>();

        for (Object tableConfigObject : tables) {
            tableConfigs.add(getTableConfig((JSONObject) tableConfigObject));
        }

        return tableConfigs;
    }

    private TableConfig getTableConfig(JSONObject tableConfigJSON) {
        String name;
        List<Source> sources = new ArrayList<>();
        List<Command> operations = new ArrayList<>();
        List<String> outputs = new ArrayList<>();

        if (!tableConfigJSON.containsKey("name")) {
            throw new RuntimeException("JSON missing \"name\"");
        }

        name = (String) tableConfigJSON.get("name");

        if (!tableConfigJSON.containsKey("sources")) {
            throw new RuntimeException("JSON missing \"sources\"");
        }

        for (Object sourceObject : (JSONArray) tableConfigJSON.get("sources")) {
            JSONObject sourceJSON = (JSONObject) sourceObject;
            // TODO Source builder?
            if (sourceJSON.get("type").equals("file")) {
                sources.add(new FileSource((String) sourceJSON.get("path")));
            }
        }

        for (Object operationObject : (JSONArray) tableConfigJSON.get("operations")) {
            JSONObject operationJSON = (JSONObject) operationObject;
            // TODO Command builder?
            if (operationJSON.get("type").equals("renameColumn")) {
                operations.add(new RenameColumn((String) operationJSON.get("oldName"), (String) operationJSON.get("newName")));
            }
            else if (operationJSON.get("type").equals("select")) {
                List<String> columns = new ArrayList<>();
                for (Object columnObject : (JSONArray) operationJSON.get("columns"))
                    columns.add((String) columnObject);
                operations.add(new Select(columns));
            }
        }

        for (Object outputObject : (JSONArray) tableConfigJSON.get("outputs")) {
            String outputString = (String) outputObject;
            outputs.add(outputString);
        }

        return new TableConfig(name, sources, operations, outputs);
    }

}
