package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        String fixed = "";

        for (int i = 0; i < sentence.length(); i++) {


            if (sentence.charAt(i)==' '){
                fixed += "_ ";

            }else{
                fixed+=sentence.charAt(i)+" ";
            }

        }
        System.out.println(fixed.trim());






    }
}
