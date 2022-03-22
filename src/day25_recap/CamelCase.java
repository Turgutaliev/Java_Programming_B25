package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = scan.nextLine().toLowerCase(Locale.ROOT);
        String cameCase = str.substring(0,1);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i-1)== ' '){
                cameCase+=str.substring(i, i+1).toUpperCase(Locale.ROOT);

            }else {
                cameCase += str.charAt(i);
            }

        }

        System.out.println(cameCase.replace(" ",""));

    }
}
