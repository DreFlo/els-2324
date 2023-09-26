package pt.up.fe.els2023;

import java.io.File;

public class MyUtils {
    public static String getExtensionFromFile(File file) {
        String extension = "";
        String filePath = file.getPath();

        int index = filePath.lastIndexOf('.');
        if (index > 0) {
            extension = filePath.substring(index + 1);
        }

        return extension;
    }
}
