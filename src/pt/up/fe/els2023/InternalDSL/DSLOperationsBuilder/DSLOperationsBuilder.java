package pt.up.fe.els2023.InternalDSL.DSLOperationsBuilder;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Command.Select;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.util.List;
import java.util.Optional;


public class DSLOperationsBuilder {
    private final DSLTableBuilder dslTableBuilder;
    private final Optional<Command> command;

    public DSLOperationsBuilder(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
        this.command = Optional.empty();
    }

    public Command getCommand() {
        if (command.isEmpty())
            throw new RuntimeException("No command was given");
        return command.get();
    }

    public DSLOperationsBuilder(DSLTableBuilder dslTableBuilder, Command command) {
        this.dslTableBuilder = dslTableBuilder;
        this.command = Optional.of(command);
    }

    public DSLSelectBuilder select() {
        return new DSLSelectBuilder(dslTableBuilder, new Select());
    }

    public DSLRenameColumnBuilder renameColumn() {
        return new DSLRenameColumnBuilder(dslTableBuilder, new pt.up.fe.els2023.Command.RenameColumn());
    }

    public DSLSquashRowsBuilder squashRows() {
        return new DSLSquashRowsBuilder(dslTableBuilder, new pt.up.fe.els2023.Command.SquashRows());
    }

    public DSLTableBuilder end() {
        dslTableBuilder.setTable(getCommand().execute(dslTableBuilder.getTable()));
        return dslTableBuilder;
    }
}
