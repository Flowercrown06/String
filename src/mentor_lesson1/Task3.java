package mentor_lesson1;

import java.util.Scanner;

public class Task3 {
    //Ededin reqemlerinin cemi (123 -> 6)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        while(number != 0){
            sum+=(number%10);
            number/=10;
        }
        System.out.println("sum= "+sum);
    }
}
