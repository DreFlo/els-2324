package pt.up.fe.els2023.Command;

import pt.up.fe.els2023.Table.Table;

import java.util.ArrayList;
import java.util.List;


public class Extract implements Command{
    String sourceColumn;
    String function;
    String sort;
    List<String> targetColumn;

    public Extract() {
        this.sort = "default";
        targetColumn = new ArrayList<>();
    }

    @Override
    public Table execute(Table table) {

        return null;
    }

    public void setSourceColumn(String sourceColumn) {
        this.sourceColumn = sourceColumn;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setTargetColumn(String column) {
        targetColumn.add(column);
    }
}
