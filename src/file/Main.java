package file;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WriteTextToFile writeTextToFile = new WriteTextToFile();
        System.out.println(writeTextToFile.writeToFile("output.txt","Hello, Java Files!"));

        ReadTextFromFile readTextFromFile = new ReadTextFromFile();
        System.out.println(readTextFromFile.readFromFile("output.txt"));

        Scanner scanner = new Scanner(System.in);
        CheckIfFileExists checkIfFileExists = new CheckIfFileExists();
        System.out.print("Enter filename: ");
        String fileName = scanner.nextLine();
        System.out.println(checkIfFileExists.checkIfFileExists(fileName));

        ListFilesInDirectory listFilesInDirectory = new ListFilesInDirectory();
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        System.out.println(listFilesInDirectory.listFilesInDirectory(directoryPath));

        System.out.print("Enter filename to delete: ");
        String fileName2 = scanner.nextLine();
        DeleteFile deleteFile = new DeleteFile();
        System.out.println(deleteFile.deleteFile(fileName2));
    }
}
