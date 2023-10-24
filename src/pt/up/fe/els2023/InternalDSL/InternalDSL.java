package pt.up.fe.els2023.InternalDSL;

public class InternalDSL {
    public DSLTableBuilder table() {
        return new DSLTableBuilder(this);
    }
}
