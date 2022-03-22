package day19_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FunTask {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scan.nextLine();
        int sentenceInt = sentence.length();
        int latIndex = sentence.length()-1;

        System.out.println(sentence);

        System.out.println(""+sentence.charAt(0)+sentence.charAt(latIndex));





    }
}
