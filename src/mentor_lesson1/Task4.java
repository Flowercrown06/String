package mentor_lesson1;

import java.util.Scanner;

public class Task4 {
    //Ededin reqemlerinin hasilinin cəminə nisbəti(Onluq vergüldən sonra 3 rəqəm dəqiqliyi ilə)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0, product=1;
        double quotient=1;
        while(number != 0){
            int temp= number%10;
            sum+=temp;
            product*=temp;
            number/=10;
        }
        quotient= (double) product /sum;
        System.out.printf("%.3f",quotient);

    }
}
