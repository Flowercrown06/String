package mentor_lesson1;

import java.util.Scanner;

public class Task2 {
    //Tək ədədlərin cəmi
    //a-dan b-ə qədər intervalda tək ədədlərin cəmini hesablayın.

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        System.out.print("a= ");
        int a= sc.nextInt();
        System.out.print("b= ");
        int b= sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
