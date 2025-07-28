package file;

import java.io.File;

public class DeleteFile {
    public String deleteFile(String fileName) {
        File file = new File(fileName);

        if (!file.exists()) {
            return "File does not exist.";
        }

        if (file.delete()) {
            return "File deleted successfully.";
        } else {
            return "Failed to delete the file.";
        }
    }
}
