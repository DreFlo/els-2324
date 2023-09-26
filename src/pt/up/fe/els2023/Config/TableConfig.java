package pt.up.fe.els2023.Config;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Config.Source.Source;

import java.util.List;

public class TableConfig {
    String tableName;
    List<Source> sources;
    List<Command> operations;
    List<String> outputs;

    public TableConfig(String tableName, List<Source> sources, List<Command> operations, List<String> outputs) {
        this.tableName = tableName;
        this.sources = sources;
        this.operations = operations;
        this.outputs = outputs;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public List<Command> getOperations() {
        return operations;
    }

    public void setOperations(List<Command> operations) {
        this.operations = operations;
    }

    public List<String> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<String> outputs) {
        this.outputs = outputs;
    }

    @Override
    public String toString() {
        return "TableConfig{" +
                "tableName='" + tableName + '\'' +
                ", sources=" + sources +
                ", operations=" + operations +
                ", outputs=" + outputs +
                '}';
    }
}
