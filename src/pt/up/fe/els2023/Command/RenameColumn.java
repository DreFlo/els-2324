package pt.up.fe.els2023.Command;

public class RenameColumn implements Command{
    String oldName;
    String newName;

    public RenameColumn(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
    }

    @Override
    public void execute() {

    }
}
