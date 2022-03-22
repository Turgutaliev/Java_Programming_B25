package day07_unary_operators;

import day03_comments_escape_sequence.Goals;

public class Letters {
    public static void main(String[] args) {
//        char T = 65;
//        char U = T++;
//        char R = U++;
//        char G = R++;
//
//        System.out.println(T+U+R+G);


        char letter = 'T';
        System.out.println("Original "+letter++);
        System.out.println("Next four: ");
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);




    }
}
