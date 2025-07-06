package lesson;

import java.util.Scanner;

// Write a Java program to test if a given string contains the specified sequence of char values
public class String4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the string: ");
        String string = in.nextLine();
        System.out.println("Type the string what u search: ");
        String search = in.nextLine();
        System.out.println(string.contains(search));
    }
}
