package pt.up.fe.els2023;


import FileSource;
import FolderSource;
import pt.up.fe.els2023.Config.Source.Source;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileMatcher {

    public FileMatcher() {}


    public static List<File> matchedFiles(Source source) {

        if (source instanceof FileSource) {
            return matchedFilesFileSource(new File("./"), source.getPathPattern());
        } else if (source instanceof FolderSource) {
            return matchedFilesFolderSource(new File("./"), source.getPathPattern());
        } else {
            System.out.println(source.toString() + " not implemented.");
        }

        return null;
    }

    // File Source

    public static List<File> matchedFilesFileSource(File sourceFile, String pattern) {

        List<File> matchedFiles = new ArrayList<>();
        String[] subPatterns = pattern.split("/");

        File[] files = getFilesFileSource(sourceFile, subPatterns[0]);

        if (files != null) {
            for (File file: files) {
                if(file.isDirectory()) {
                    matchedFiles.addAll(matchedFilesFileSource(file, pattern.replace(subPatterns[0] + "/", "")));
                } else {
                    matchedFiles.add(file);
                }
            }
        }

        return matchedFiles;
    }

    /**
     * Configuration to set what path from sourceFile is accepted
     * @return Files accepted
     */
    private static File[] getFilesFileSource(File sourceFile, String subPattern) {
        FilenameFilter filenameFilter = (dir, name) -> {
            if (subPattern.contains("*")) {
                if(subPattern.contains(".")) {
                    String extension = Utils.getExtensionFromPath(subPattern);
                    return name.toLowerCase().endsWith("." + extension);
                }
                else {
                    return true;
                }
            }

            Pattern pattern = Pattern.compile(subPattern);
            Matcher matcher = pattern.matcher(name);
            if(matcher.matches()) {
                return true;
            }
            return name.matches(subPattern);
        };

        return sourceFile.listFiles(filenameFilter);
    }



    // Folder Source

    public static List<File> matchedFilesFolderSource(File sourceFile, String pathPattern) {

        List<File> matchedFiles = new ArrayList<>();
        Queue<File> fileQueue = new PriorityQueue<>();
        ArrayList<String> subPatterns = new ArrayList<>(Arrays.asList(pathPattern.split("/")));

        fileQueue.addAll(getFilesFolderSource(sourceFile, subPatterns));

        while(!fileQueue.isEmpty()) {
            File file = fileQueue.poll();

            if (file.isFile()) {
                matchedFiles.add(file);
            } else if(file.isDirectory()) {
                fileQueue.addAll(Arrays.asList(Objects.requireNonNull(file.listFiles())));
            } else {
                System.out.println(file.getName() + " is neither a Directory nor a File.");
            }
        }

        return matchedFiles;
    }

    private static List<File> getFilesFolderSource(File sourceFile, ArrayList<String> subPatterns) {
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
            matchedFiles.addAll(getFilesFolderSource(file, subPatterns));
        }

        return matchedFiles;
    }
}