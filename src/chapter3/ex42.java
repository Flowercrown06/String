package chapter3;

public class ex42 {
    public String runTest(boolean spinner, boolean roller) {
            if (spinner=roller) return "up";
            else return roller? "down" : "middle" ;
    }

    public static final void main(String pices[]) {
        final ex42 tester = new ex42();
        System.out.println(tester.runTest(false, true));

    }
}
