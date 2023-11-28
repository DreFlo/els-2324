package pt.up.fe.els2023.CustomExceptions;

import java.util.List;

public class SyntaxException extends Exception{
    public SyntaxException(List<String> messages) {
        super("Syntax Error: " + String.join("\n", messages));
    }
}
