package mentor_lesson2;

public class Task5 {
    //      *   5- 1*
    //     **   4- 2*
    //    ***   3- 3*
    //   ****
    //  *****
    // ******
    public static void main(String[] args) {
        int count= 5;
        while (count>0) {
            for(int i =count; i>1; i--){
                System.out.print(" ");
            }
            for(int j=1; j>=count; j--){
                count++;
                System.out.print("*");
            }
            System.out.println();
            count--;
        }

    }
}
