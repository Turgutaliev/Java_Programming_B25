package day13_if_statements;

import java.util.Scanner;

public class NTest {

            /*
            You'll have a number
            based on that number you should print:

            if number is divisible by 3 print -> Fizz
            if number is divisible by 5 print -> Buzz
            if number is divisible by both 3 and 5 -> FizzBuzz
            if number is not divisible by any of those print just the number
             */
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter the number");
                int number = input.nextInt();
                String word;
                if (number % 3 == 0 && number % 5 == 0) {
                    word = "FizzBuzz";
                } else if (number % 5 == 0) {
                    word = "Buzz";
                } else if (number % 3 == 0) {
                    word = "Fizz";
                }else{
                    word = ""+number;
                }

                System.out.println(word);

            }
        }


