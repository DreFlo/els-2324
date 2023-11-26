package pt.up.fe.els2023;

import pt.up.fe.els2023.Config.Source.FileSystemSource;
import pt.up.fe.els2023.exceptions.NotDirectoryNorFileException;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileMatcher {

    public FileMatcher() {}


    public static List<File> matchedFiles(FileSystemSource source) throws NotDirectoryNorFileException {
        List<File> matchedFiles = new ArrayList<>();
        Queue<File> fileQueue = new PriorityQueue<>();
        ArrayList<String> subPatterns = new ArrayList<>(Arrays.asList(source.getPathPattern().split("/")));

        fileQueue.addAll(getFiles(new File("./"), subPatterns));

        while(!fileQueue.isEmpty()) {
            File file = fileQueue.poll();

            if (file.isFile()) {
                matchedFiles.add(file);
            } else if(file.isDirectory()) {
                fileQueue.addAll(Arrays.asList(Objects.requireNonNull(file.listFiles())));
            } else {
                throw new NotDirectoryNorFileException(file.getName());
            }
        }

        return matchedFiles;
    }

    private static List<File> getFiles(File sourceFile, ArrayList<String> subPatterns) {
        if (subPatterns.isEmpty()) {
            return Arrays.asList(Objects.requireNonNull(sourceFile.listFiles()));
        }

        FilenameFilter filenameFilter = (dir, name) -> {

            Pattern pattern = Pattern.compile(subPatterns.get(0));
            Matcher matcher = pattern.matcher(name);

            if(matcher.matches()) {
                return true;
            }
            return name.matches(subPatterns.get(0));
        };

        File[] files = sourceFile.listFiles(filenameFilter);
        List<File> matchedFiles = new ArrayList<>();
        subPatterns.remove(0);

        assert files != null;

        for (File file: files) {
            matchedFiles.addAll(getFiles(file, subPatterns));
        }

        return matchedFiles;
    }
}