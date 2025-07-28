package file;

import java.io.File;

public class ListFilesInDirectory {
    public String listFilesInDirectory(String path) {
        File directory = new File(path);

        if (!directory.exists()) {
            return "The directory does not exist.";
        }

        if (!directory.isDirectory()) {
            return "The given path is not a directory.";
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            return "The directory is empty.";
        }

        StringBuilder result = new StringBuilder("Files in directory:\n");
        for (File file : files) {
            if (file.isFile()) {
                result.append(file.getName()).append("\n");
            }
        }

        return result.toString();
    }
}
