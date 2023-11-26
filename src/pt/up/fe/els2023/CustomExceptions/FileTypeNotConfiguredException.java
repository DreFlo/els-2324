package pt.up.fe.els2023.CustomExceptions;

public class FileTypeNotConfiguredException extends Exception{
    public FileTypeNotConfiguredException(String fileType) {
        super(fileType + " file type not configured.");
    }
}
