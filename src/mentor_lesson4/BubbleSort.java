package mentor_lesson4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array ={1,3,2,5,6,8,4,9,7};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
