package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.Reduce.Reduce;
import pt.up.fe.els2023.Command.Reduce.ReduceFunctions;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.util.List;
import java.util.function.Function;

public class DSLReduce extends DSLOperation<Reduce> {

    public DSLReduce(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new Reduce());
    }

    public DSLReduce function(String function) {
        getCommand().setFunction(ReduceFunctions.valueOf(function));
        return this;
    }

    public DSLReduce objectType(String objectType) throws ClassNotFoundException {
        getCommand().setObjectType(Class.forName(objectType));
        return this;
    }
}
