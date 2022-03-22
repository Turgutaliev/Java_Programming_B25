package day25_recap;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence with 3 words");
        String sentence = scan.nextLine().trim();
        System.out.println(sentence);

        int firstSpace = sentence.indexOf(" ");
        int lastSpace = sentence.lastIndexOf(" ");
        String middleWord = sentence.substring(firstSpace, lastSpace);
        System.out.println(middleWord);
        String reversedMiddleWord = "";

        for (int i = middleWord.length()-1; i>=0; i--) {


            reversedMiddleWord+=middleWord.charAt(i);

        }

        String firstWord = sentence.substring(0, firstSpace+1);
        String lastWord = sentence.substring(lastSpace+1);

        System.out.println(firstWord+reversedMiddleWord+lastWord);










    }
}
