package chapter3;

public class ex20 {
    public static void main(String[] args) {
        int leaders= 10 * (2+(1+2/5));
        int followers= leaders * 2;
        System.out.println(leaders+followers<10? "few":"many");
    }
}
