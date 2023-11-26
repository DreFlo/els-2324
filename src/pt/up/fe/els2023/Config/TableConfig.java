package pt.up.fe.els2023.Config;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Config.Source.Source;

import java.util.List;

public class TableConfig {
    List<Source> sources;
    List<Command> operations;
    List<String> outputs;

    public TableConfig(List<Source> sources, List<Command> operations, List<String> outputs) {
        this.sources = sources;
        this.operations = operations;
        this.outputs = outputs;
    }

    public List<Source> getSources() {
        return sources;
    }

    public List<Command> getOperations() {
        return operations;
    }

    public List<String> getOutputs() {
        return outputs;
    }

    @Override
    public String toString() {
        return "TableConfig{" +
                "sources=" + sources +
                ", operations=" + operations +
                ", outputs=" + outputs +
                '}';
    }
}
