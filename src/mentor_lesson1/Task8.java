package mentor_lesson1;

import java.util.Scanner;

public class Task8 {
    //Çevrilmə
    //Hər hansı bir natural n ədədini götürək. Onu növbəti şəkildə dəyişdirəcəyik:
    // Əgər ədəd cütdürsə, onda onu 2-ə bölək, əgər təkdirsə ona 1 əlavə edək.
    // Bir neçə belə dəyişmədən sonra həmişə 1 alacağıq.Məs, 11 ədədindən 12 ədədi alınır,sonra 6, 3, 4, 2 və sonda 1.
    // Beləliklə, 11-dən 1 almaq üçün 6 dəyişiklik etmək lazımdır.
    //Verilmiş natural ədədə görə 1 alınana qədər onun dəyişmələrinin sayını tapın. (input: 11 ; output: 6)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        while (number != 1) {
            if (number % 2 == 0) {
                number/=2;
                count++;
            }
            else {
                number+=1;
                count++;
            }
        }
        System.out.println(count);
    }
}
