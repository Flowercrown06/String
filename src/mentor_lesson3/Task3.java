package mentor_lesson3;

import java.util.Arrays;

//ilk elementle son elementin yerlerini deyismek
public class Task3 {
    public static void main(String[] args) {
        int[] arr= { 1,2,3,4,8,5};
        arr[0]=arr[0]+arr[arr.length-1];
        arr[arr.length-1]=arr[0]-arr[arr.length-1];
        arr[0]=arr[0]-arr[arr.length-1];
        System.out.println(Arrays.toString(arr));
    }
}
