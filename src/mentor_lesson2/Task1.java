package mentor_lesson2;

import java.util.Scanner;

public class Task1 {
    //Ədədin ikinci rəqəmi
    //Tam ədədin(menfi eded de verile biler) ikinci rəqəmini tapmalı.
    // Sayma yüksək mərtəbədən başlayır.(input 43694 -> output 3)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        number = Math.abs(number);
        int num= number, count = 0, digit=0;
        while (num > 0) {
            num/=10;
            count++;
        }
        for (int i = 0; i < count-1; i++) {
            digit = number %10;
            number /= 10;
        }
        System.out.println(digit);

    }
}
