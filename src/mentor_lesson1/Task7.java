package mentor_lesson1;

import java.util.Scanner;

public class Task7 {
    // Ededin tersini yazmaq (1234 -> 4321)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int reversed=0;
        while (number != 0) {
            int digit= number%10;
            reversed = reversed*10 + digit;
            number = number/10;
        }
        System.out.println(reversed);

    }
}
