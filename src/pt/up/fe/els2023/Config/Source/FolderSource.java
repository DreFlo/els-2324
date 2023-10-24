package pt.up.fe.els2023.Config.Source;

public class FolderSource extends Source{

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
