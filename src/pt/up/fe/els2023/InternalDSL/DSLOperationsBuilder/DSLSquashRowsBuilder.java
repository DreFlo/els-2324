package pt.up.fe.els2023.InternalDSL.DSLOperationsBuilder;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLSquashRowsBuilder extends DSLOperationsBuilder{
    public DSLSquashRowsBuilder(DSLTableBuilder dslTableBuilder, Command command) {
        super(dslTableBuilder, command);
    }
}
