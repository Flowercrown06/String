package lesson;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number: ");
        int number = in.nextInt();
        int count=0;
        String str = Integer.toString(number);
        int num=str.length()-1;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)==str.charAt(num)){
                count++;
                num--;
            }
        }

        if(count==(str.length()/2)){
            System.out.println("The number "+number+" is a polindrom.");
        }
        else {
            System.out.println("The number "+number+" is not a polindrom.");
        }

    }
}
