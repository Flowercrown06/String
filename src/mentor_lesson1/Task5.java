package mentor_lesson1;

import java.util.Scanner;

public class Task5 {
    //Mukemmel ededleri cixaran kod(ozunden basqa bolenlerinin cemi ozunu veren eded -> 6)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println("It is a perfect number");
        }
        else {
            System.out.println("It is not a perfect number");
        }
    }
}
