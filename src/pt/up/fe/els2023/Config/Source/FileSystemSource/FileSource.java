package pt.up.fe.els2023.Config.Source.FileSystemSource;

public class FileSource extends FileSystemSource {

    public FileSource() {
        super();
    }

    public FileSource(String pathPattern) {
        super(pathPattern);
    }

    @Override
    public String toString() {
        return "FileSource{" +
                "pathPattern='" + getPathPattern() + '\'' +
                '}';
    }
}
