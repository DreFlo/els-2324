package pt.up.fe.els2023.Config.Source.FileSystemSource;

public class FolderSource extends FileSystemSource {

    public FolderSource() {
        super();
    }

    public FolderSource(String pathPattern) {
        super(pathPattern);
    }

    @Override
    public String toString() {
        return "FolderSource{" +
                "pathPattern='" + getPathPattern() + '\'' +
                '}';
    }
}
