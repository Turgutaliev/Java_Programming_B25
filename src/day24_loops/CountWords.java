package day24_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine().trim();
        int spaces = 0;


        for (int i = 0; i < sentence.length(); i++) {


            if(sentence.charAt(i)== ' '){
                spaces++;
            }

        }

        System.out.println("Number of words: "+ (spaces+1));




    }
}
