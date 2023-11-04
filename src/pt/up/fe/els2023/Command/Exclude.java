package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;

public class Exclude implements Command {

    List<String> stringConditions;
    List<Class<?>> typeConditions;

    public Exclude() {
        stringConditions = new ArrayList<>();
    }

    @Override
    public Table execute(Table table) {
        return null;
    }

    public void addCondition(String condition) {
        stringConditions.add(condition);
    }

    public void addCondition(Class<?> condition) {
        typeConditions.add(condition);
    }
}
