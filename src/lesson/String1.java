package lesson;

import java.util.Scanner;

// Write a Java program to get the character at the given index within the String (Original String = Java Exercises!
// The character at position 0 is J)
public class String1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.nextLine();
        System.out.println("Enter index: ");
        int index = in.nextInt();
        System.out.println(str.charAt(index));
    }
}
