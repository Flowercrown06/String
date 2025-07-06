package mentor_lesson3;

import java.util.Arrays;

//Tam ədədlər ardıcıllığı verilir(array ile).
// Ardıcıllığın hər bir mənfi olmayan elementini 2 vahid artırmalı(arrayde qalacaq).
public class Task4 {
    public static void main(String[] args) {
        int[] arr= { 1,-2,3,4,-1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) {
                arr[i]+=2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
