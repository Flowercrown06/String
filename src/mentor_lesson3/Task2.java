package mentor_lesson3;
//arraydeki elementlerin ortalamasini tapmaq.
public class Task2 {
    public static void main(String[] args) {
        int[] arr= { 1,2,3,4};
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        sum=sum/arr.length;
        System.out.println(sum);
    }
}
