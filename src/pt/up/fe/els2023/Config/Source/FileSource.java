package pt.up.fe.els2023.Config.Source;

public class FileSource extends Source {
    private String pathPattern;


    public FileSource(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    public String getPathPattern() {
        return pathPattern;
    }

    @Override
    public String toString() {
        return "FileSource{" +
                "pathPattern='" + pathPattern + '\'' +
                '}';
    }
}
