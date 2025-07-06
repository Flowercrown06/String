package mentor_lesson3;
//iki tekrarlanmayan sirali elementli arrayler arasinda ortaq elementleri cixisa vermek.
//array1: 1 3 4 9 15
//array2: 2 3 5 9 14
//output: 3 9
public class Task1 {
    public static void main(String[] args) {
        int[] array1= {1,3,4,9,15};
        int[] array2= {2,3,5,9,14};

        for(int i =0; i< array1.length; i++){
            for(int j =0; j< array2.length; j++){
                if(array1[i]==array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
