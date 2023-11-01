package pt.up.fe.els2023.Config.Source.FileSystemSource;

import pt.up.fe.els2023.Config.Source.Source;

import java.util.Optional;

public class FileSystemSource extends Source {
    private Optional<String> pathPattern;

    public FileSystemSource() {
        super();
        this.pathPattern = Optional.empty();
    }

    public FileSystemSource(String pathPattern) {
        super();
        this.pathPattern = pathPattern.describeConstable();
    }

    public String getPathPattern() {
        if (pathPattern.isEmpty())
            throw new RuntimeException("Path is empty");
        return pathPattern.get();
    }

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern.describeConstable();
    }

    public void unsetPathPattern() {
        this.pathPattern = Optional.empty();
    }

    public boolean isEmpty() {
        return pathPattern.isEmpty();
    }
}
