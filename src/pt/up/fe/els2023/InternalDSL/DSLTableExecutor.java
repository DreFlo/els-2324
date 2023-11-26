package pt.up.fe.els2023.InternalDSL;

import java.util.Objects;

public class DSLTableExecutor implements InternalDSLExecutable{
    private final DSLTableBuilder dslTableBuilder;

    public DSLTableExecutor(DSLTableBuilder dslTableBuilder) {
        this.dslTableBuilder = dslTableBuilder;
    }

    public DSLTableBuilder getDSLTableBuilder() {
        return dslTableBuilder;
    }

    @Override
    public void execute() throws Exception {
        while (!getDSLTableBuilder().getExecutableQueue().isEmpty()) {
            Objects.requireNonNull(getDSLTableBuilder().getExecutableQueue().poll()).execute();
        }
    }
}
