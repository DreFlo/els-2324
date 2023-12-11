package pt.up.fe.els2023.Command.RenameColumn;

public abstract class RenameColumnByPattern extends RenameColumn {
    private String pattern;

    public RenameColumnByPattern() {
        this.pattern = "";
    }

    public RenameColumnByPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
