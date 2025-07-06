package mentor_lesson3;

import java.util.Scanner;

//n sayda tam ədədlər üçün 6-ya tam (qalıqsız) bölünən müsbət ədədlərin cəmini və sayını tapın.
// (n - arrayin ölçüsüdü Scanner ile daxil edin)
public class Task6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0, sum=0;
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " number");
            arr[i]= sc.nextInt();
            if(arr[i]%6==0 &&  arr[i]>0) {
                sum+=arr[i];
                count++;
            }
        }
        System.out.println("count = " + count + ", sum= " + sum);



    }
}
