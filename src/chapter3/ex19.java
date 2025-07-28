package chapter3;
// ?? what is the logical of this one?
public class ex19 {
    public static void main(String[] input) {
        int time= 11;
       // int day= 4;
        boolean day = true;
        String dinner= time > 10 ? day ? "Takeout" : "Salad" : "Leftovers" ;
        System.out.println(dinner);
    }
}
