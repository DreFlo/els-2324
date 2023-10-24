package pt.up.fe.els2023.Config.Source;

public class FileSource extends Source {

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
