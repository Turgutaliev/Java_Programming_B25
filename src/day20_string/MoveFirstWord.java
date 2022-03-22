package day20_string;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().trim();

        int spaceIndex = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, spaceIndex);

        String result = sentence.substring(spaceIndex+1)+ " "+ firstWord;


        System.out.println(result);






    }

}
