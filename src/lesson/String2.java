package lesson;

import java.util.Scanner;

//Write a Java program to compare two strings lexicographically, ignoring case differences
public class String2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the first string: ");
        String str = in.nextLine();
        System.out.println("Type the second string: ");
        String str2 = in.nextLine();
        System.out.println(str.equalsIgnoreCase(str2));

    }
}
