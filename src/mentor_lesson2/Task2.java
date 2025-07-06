package mentor_lesson2;

public class Task2 {
    //Fibonacci sirasi:  0 1 1 2 3 5 8 13 21 34

    public static void main(String[] args) {
        int a=0, b =1;
        for(int i=0;i<=10;i++) {
            System.out.print(a+" "+b+" ");
            a=a+b;
            b=b+a;
        }
    }
}
