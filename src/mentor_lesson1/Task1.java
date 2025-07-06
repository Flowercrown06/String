package mentor_lesson1;

import java.util.Scanner;

public class Task1 {
    //a, b, c tam ədədləri verilir. Onların arasında heç olmazsa bir cüt və bir tək ədəd olub olmadığını təyin edin.
    // "YES" və ya "NO" çap etməli. Hamsi cut ve ya hamsi tekdirse NO.

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ender the first number: ");
        int first=sc.nextInt();
        System.out.println("Ender the second number: ");
        int second=sc.nextInt();
        System.out.println("Ender the third number: ");
        int third=sc.nextInt();

        if((first%2==0 && second%2==0 && third%2==0) || (first%2!=0 && second%2!=0 && third%2!=0) )
            System.out.println("No");
        else System.out.println("Yes");


    }
}
