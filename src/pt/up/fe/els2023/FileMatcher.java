package pt.up.fe.els2023;


import pt.up.fe.els2023.Config.Source.FileSource;
import pt.up.fe.els2023.Config.Source.FolderSource;
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
            return matchedFilesFolderSource(new File(source.getPathPattern()));
        } else {
            System.out.println(source.toString() + " not implemented.");
        }

        return null;
    }

    // File Source

    public static List<File> matchedFilesFileSource(File sourceFile, String pattern) {

        List<File> matchedFiles = new ArrayList<>();
        String[] subPatterns = pattern.split("/");

        File[] files = getFiles(sourceFile, subPatterns[0]);

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
    private static File[] getFiles(File sourceFile, String subPattern) {
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

    public static List<File> matchedFilesFolderSource(File folderFile) {
        List<File> matchedFiles = new ArrayList<>();

        if (folderFile.isDirectory()) {
            File[] files = folderFile.listFiles();
            assert files != null;
            for(File file: files) {
                matchedFiles.addAll(matchedFilesFolderSource(file));
            }
        } else if (folderFile.isFile()) {
            matchedFiles.add(folderFile);
        } else {
            System.out.println(folderFile.getName() + " is neither a Directory not a File.");
        }

        return matchedFiles;
    }
}