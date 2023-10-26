package pt.up.fe.els2023.InternalDSL.DSLOperationsBuilder;

import pt.up.fe.els2023.Command.Command;
import pt.up.fe.els2023.Command.Select;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLSelectBuilder extends DSLOperationsBuilder{
    DSLSelectBuilder(DSLTableBuilder dslTableBuilder, Command command) {
        super(dslTableBuilder, command);
    }

    public DSLSelectBuilder column(String column) {
        ((Select) getCommand()).addHeader(column);
        return this;
    }
}
