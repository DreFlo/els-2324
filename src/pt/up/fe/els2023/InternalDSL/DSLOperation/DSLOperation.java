package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.util.Optional;

public class DSLOperation<C extends Command> {
    private final DSLTableBuilder dslTableBuilder;
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

    public final DSLTableBuilder end() {
        dslTableBuilder.setTable(getCommand().execute(dslTableBuilder.getTable()));
        return dslTableBuilder;
    }
}
