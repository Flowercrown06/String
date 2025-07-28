package file;

import java.io.File;

public class CheckIfFileExists {
    public String checkIfFileExists(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            return "File exists: " + file.getAbsolutePath();
        } else {
            return "File does not exist.";
        }
    }
}
