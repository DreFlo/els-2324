package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.Select;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

public class DSLSelect extends DSLOperation<Select> {
    DSLSelect(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new Select());
    }

    public DSLSelect column(String... column) {
        for (String c : column) {
            getCommand().addHeaderPattern(c);
        }
        return this;
    }
}
