package mentor_lesson1;

import java.util.Scanner;

public class Task6 {
    //Factorial

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fact = sc.nextInt();
        int product = 1;
       /* for (int i=1; i<=fact; i++) {
            product = product * i;
        }
        */
         while(fact > 0) {
            product *= fact;
            fact--;
        }
        System.out.println(product);


    }
}
