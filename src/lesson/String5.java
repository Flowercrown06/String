package lesson;

import java.util.Scanner;

// Stringdəki rəqəmləri çıxartmaq
// (Meselen string budur: Ja8va4 20progr9am) burdan reqemleri silib ancaq herfleri capa vermek lazimdir
public class String5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the string: ");
        String str = in.nextLine();
        System.out.println(str.replaceAll("[0-9]", ""));

    }

}
