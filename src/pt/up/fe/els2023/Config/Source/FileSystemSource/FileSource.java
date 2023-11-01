package pt.up.fe.els2023.Config.Source.FileSystemSource;

import pt.up.fe.els2023.Config.Source.Source;

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
