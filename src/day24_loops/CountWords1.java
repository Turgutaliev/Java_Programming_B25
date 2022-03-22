package day24_loops;

import java.util.Scanner;

public class CountWords1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scan.nextLine().trim();
        int spaces = 0;
        int s=0;

        for (int i = 0; i < sentence.length(); ++i) {

            if(sentence.charAt(i) == ' '){
                spaces++;

            }if(sentence.charAt(i) == 's'){
                s++;

            }

        }
        System.out.println("words: "+(spaces+1));
        System.out.println("how many 's' ? : "+s);










    }

}
