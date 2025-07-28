package chapter3;
// fifty-fifty
public class ex18 {
    public static void main(String[] args) {
        byte dayOfWeek = 16; //written by me  type can be byte, int but can't be long
        final byte saturday =6;
        switch (dayOfWeek){
            default:
                System.out.println("Another Weekday");
                break;
            case saturday:
                System.out.println("Weekend!");
        }
    }
}
