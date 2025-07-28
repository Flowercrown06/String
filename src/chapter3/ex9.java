package chapter3;

public class ex9 {
    public void calculateResult(Integer candidateA, Integer candidateB) {
        boolean process= candidateA == null || candidateA.intValue() < 10;
       // boolean value = candidateA && candidateB;
        boolean value = candidateA==null  && candidateB==null; // I wrote it by myself, darkness point is why code compile without any excep because of parameters' difference
        System.out.println( process || value);
    }

    public static void main(String[] unused) {
      new ex9().calculateResult(null, 203);
    }
}
