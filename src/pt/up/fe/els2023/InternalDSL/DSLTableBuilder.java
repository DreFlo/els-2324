package pt.up.fe.els2023.InternalDSL;

import pt.up.fe.els2023.InternalDSL.DSLOperation.DSLOperationBuilder;
import pt.up.fe.els2023.InternalDSL.DSLOutput.DSLOutputBuilder;
import pt.up.fe.els2023.InternalDSL.DSLSource.DSLSourceBuilder;
import pt.up.fe.els2023.Table.Table;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DSLTableBuilder {
    private Table table;

    private final Queue<InternalDSLExecutable> executableQueue;

    public DSLTableBuilder() {
        this.table = new Table();
        this.executableQueue = new LinkedList<>();
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public DSLSourceBuilder source() {
        return new DSLSourceBuilder(this);
    }

    public DSLOperationBuilder operation() {
        return new DSLOperationBuilder(this);
    }

    public DSLTableBuilder outputTo(String path) {
        return new DSLOutputBuilder(this).outputTo(path);
    }

    public DSLTableExecutor end() {
        return new DSLTableExecutor(this);
    }

    public void addExecutable(InternalDSLExecutable executable) {
        executableQueue.add(executable);
    }

    public Queue<InternalDSLExecutable> getExecutableQueue() {
        return executableQueue;
    }
}

