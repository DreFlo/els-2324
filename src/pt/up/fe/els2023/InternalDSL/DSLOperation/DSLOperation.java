package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;
import pt.up.fe.els2023.InternalDSL.InternalDSLExecutable;

import java.util.Optional;

public class DSLOperation<C extends Command> implements InternalDSLExecutable {
    protected final DSLTableBuilder dslTableBuilder;
    private final Optional<C> command;

    public DSLOperation(DSLTableBuilder dslTableBuilder, C command) {
        this.dslTableBuilder = dslTableBuilder;
        this.command = Optional.of(command);
    }

    public C getCommand() {
        if (command.isEmpty())
            throw new RuntimeException("No command was given");
        return command.get();
    }

    public DSLTableBuilder getDSLTableBuilder() {
        return dslTableBuilder;
    }

    public DSLTableBuilder end() throws Exception {
        getDSLTableBuilder().addExecutable(this);
        return getDSLTableBuilder();
    }

    public void execute() throws Exception {
        dslTableBuilder.setTable(getCommand().execute(dslTableBuilder.getTable()));
    }
}
