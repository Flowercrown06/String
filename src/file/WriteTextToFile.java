package file;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class WriteTextToFile {
    /*public String createFile(String fileName) throws IOException {
        File file = new File(fileName);
        boolean newFile= file.createNewFile();
        if(newFile){
            return "successfully created " + file.getAbsolutePath();
        }
        return "already created";
    }

    public String deleteFile(String fileName) throws IOException {
        File file = new File(fileName);
        if(file.delete()){
            return "successfully deleted " + file.getAbsolutePath();
        }
        throw new FileNotFoundException("File not found");
    }*/

    public String writeToFile(String fileName, String content)  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            return "Successfully written to " + fileName;
        } catch (IOException e) {
            return "An error occurred: " + e.getMessage();
        }
    }

}
