package pt.up.fe.els2023.CustomExceptions;

public class NotDirectoryNorFileException extends Exception {
    public NotDirectoryNorFileException(String filePath) {
        super(filePath + " is not a Directory nor a File.");
    }
}
