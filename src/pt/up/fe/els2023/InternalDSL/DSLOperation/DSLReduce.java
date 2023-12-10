package pt.up.fe.els2023.InternalDSL.DSLOperation;

import pt.up.fe.els2023.Command.Reduce.Reduce;
import pt.up.fe.els2023.InternalDSL.DSLTableBuilder;

import java.util.List;
import java.util.function.Function;

public class DSLReduce extends DSLOperation<Reduce> {

    public DSLReduce(DSLTableBuilder dslTableBuilder) {
        super(dslTableBuilder, new Reduce());
    }

    public DSLReduce function(Function<List<?>, Object> function) {
        getCommand().setFunction(function);
        return this;
    }

    public DSLReduce objectType(Class<?> objectType) {
        getCommand().setObjectType(objectType);
        return this;
    }
}
