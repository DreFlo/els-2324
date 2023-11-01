package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.SquashRows;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLSquashRows extends DSLOperation<SquashRows> {
    public DSLSquashRows(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new SquashRows());
    }
}
