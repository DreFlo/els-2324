package pt.up.fe.els2023.Command.RenameColumn;
public class RenameColumnPrepend extends RenameColumnByPattern {
    private String prepend;

    public RenameColumnPrepend() {
        super();
        this.prepend = "";
    }

    public RenameColumnPrepend(String pattern, String prepend) {
        super(pattern);
        this.prepend = prepend;
    }

    public String getPrepend() {
        return prepend;
    }

    public void setPrepend(String prepend) {
        this.prepend = prepend;
    }

    @Override
    protected boolean matches(String header) {
        return header.matches(getPattern());
    }

    @Override
    protected String getNewName(String header) {
        return prepend + header;
    }
}
