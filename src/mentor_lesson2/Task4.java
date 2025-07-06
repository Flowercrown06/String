package mentor_lesson2;

public class Task4 {
    // *****
    // ****
    // ***
    // **
    // *

    public static void main(String[] args) {
        int count= 5;
        for(int i=0;i<5;i++) {
            for(int j=count; j>0; j--){
                System.out.print("*");
            }
            count--;
            System.out.println();
        }
    }
}
