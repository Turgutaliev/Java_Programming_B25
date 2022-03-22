package day25_recap;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        System.out.println("many times do you want to repeat");
        int repeat = scan.nextInt();


        for (int i = 0; i < repeat; i++) {

            word += word.charAt(word.length()-1);






        }

        System.out.println(word);

    }
}
