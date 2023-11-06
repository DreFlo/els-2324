package pt.up.fe.els2023.ConfigFileParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Command.RenameColumn;
import pt.up.fe.els2023.Command.Select;
import pt.up.fe.els2023.Config.Source.Source;
import pt.up.fe.els2023.Config.Source.SourceBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONConfigFileParser extends ConfigFileParser<JSONObject> {
    public JSONConfigFileParser(File inputFile) {
        super(inputFile);
    }

    @Override
    public void parse() throws RuntimeException {
        try {
            parserObject = (JSONObject) new JSONParser().parse(new FileReader(inputFile));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected List<JSONObject> retrieveConfigurationTableList(JSONObject jsonObject) {
        JSONArray jsonArray = (JSONArray) jsonObject.get("tables");
        List<JSONObject> jsonObjectList = new ArrayList<>();
        for (Object object : jsonArray) {
            jsonObjectList.add((JSONObject) object);
        }
        return jsonObjectList;
    }

    @Override
    protected String extractTableName(JSONObject jsonObject) {
        return (String) jsonObject.get("name");
    }

    @Override
    protected void extractSources(List<Source> sources, JSONObject jsonObject) {
        for (Object sourceObject : (JSONArray) jsonObject.get("sources")) {
            JSONObject sourceJSON = (JSONObject) sourceObject;
            sources.add(SourceBuilder.getSource((String) sourceJSON.get("type"), sourceJSON));
        }
    }

    @Override
    protected void extractCommands(List<Command> operations, JSONObject jsonObject) {
        for (Object operationObject : (JSONArray) jsonObject.get("operations")) {
            JSONObject operationJSON = (JSONObject) operationObject;

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
    }

    @Override
    protected void extractOutputs(List<String> outputs, JSONObject jsonObject) {
        for (Object outputObject : (JSONArray) jsonObject.get("outputs")) {
            String outputString = (String) outputObject;
            outputs.add(outputString);
        }
    }

    @Override
    protected boolean hasTables(JSONObject jsonObject) {
        return jsonObject.containsKey("tables");
    }

    @Override
    protected boolean hasTableName(JSONObject jsonObject) {
        return jsonObject.containsKey("name");
    }

    @Override
    protected boolean hasSources(JSONObject jsonObject) {
        return jsonObject.containsKey("sources");
    }

    @Override
    protected boolean hasOperations(JSONObject jsonObject) {
        return jsonObject.containsKey("operations");
    }

    @Override
    protected boolean hasOutputs(JSONObject jsonObject) {
        return jsonObject.containsKey("outputs");
    }

}
