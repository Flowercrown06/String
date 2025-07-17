package nothing;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        for(int i='a';i<='z';i++){
            sb.append((char)i);
            System.out.println(sb.hashCode());
        }
        System.out.println(sb);

        Integer a = 130;
        Integer b = 130;
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
