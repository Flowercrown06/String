package lesson;

import java.util.Scanner;

// Write a Java program to concatenate a given string to the end of another string
public class String3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the first string: ");
        String str = in.nextLine();
        System.out.println("Type the second string: ");
        String str2 = in.nextLine();
        System.out.println(str.concat(str2));
    }
}
