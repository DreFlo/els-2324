package pt.up.fe.els2023.Config.Source;

import java.util.Optional;

public abstract class Source {
    private Optional<String> pathPattern;

    public Source() {
        this.pathPattern = Optional.empty();
    }

    public Source(String pathPattern) {
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
