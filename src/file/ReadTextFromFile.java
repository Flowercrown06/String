package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {
    public String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            return content.toString();

        } catch (IOException e) {
            return "An error occurred: " + e.getMessage();
        }
    }
}
