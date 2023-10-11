package pt.up.fe.els2023.Config.Source;

public class FolderSource extends Source{
    private String pathPattern;

    public FolderSource(String pathPattern) {
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
        return "FolderSource{" +
                "pathPattern='" + pathPattern + '\'' +
                '}';
    }
}
