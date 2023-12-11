package pt.up.fe.els2023.Command.RenameColumn;

import java.util.regex.Pattern;

public class RenameColumnReplace extends RenameColumnByPattern{
    private String replacement;

    public RenameColumnReplace() {
        this.replacement = "";
    }

    public RenameColumnReplace(String pattern, String replace, String replacement) {
        super(pattern);
        this.replacement = replacement;
    }

    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    @Override
    protected boolean matches(String header) {
        return Pattern.compile(getPattern()).matcher(header).find();
    }

    @Override
    protected String getNewName(String header) {
        return header.replaceAll(getPattern(), getReplacement());
    }
}
