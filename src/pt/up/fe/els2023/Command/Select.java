package pt.up.fe.els2023.Command;

import java.util.List;

public class Select implements Command {
    List<String> selected;

    public Select(List<String> selected) {
        this.selected = selected;
    }

    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "Select{" +
                "selected=" + selected +
                '}';
    }
}
