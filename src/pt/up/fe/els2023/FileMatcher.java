package pt.up.fe.els2023;


import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class FileMatcher {

    public FileMatcher() {}

    public List<File> matchedFiles(File sourceFile, String pattern) {

        List<File> matchedFiles = new ArrayList<>();
        String[] subPatterns = pattern.split("/");
        File[] files = getFiles(sourceFile, subPatterns);

        if (files != null) {
            for (File file: files) {
                if(file.isDirectory()) {
                    matchedFiles.addAll(matchedFiles(file, pattern.replace(subPatterns[0] + "/", "")));
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
    private static File[] getFiles(File sourceFile, String[] subPatterns) {
        FilenameFilter filenameFilter = (dir, name) -> {
            if (subPatterns[0].contains("*")) {
                if(subPatterns[0].contains(".")) {
                    String extension = Utils.getExtensionFromPath(subPatterns[0]);
                    return name.toLowerCase().endsWith("." + extension);
                }
                else {
                    return true;
                }
            }
            return name.matches(subPatterns[0]);
        };

        return sourceFile.listFiles(filenameFilter);
    }


}
