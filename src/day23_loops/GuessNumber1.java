package day23_loops;

import java.util.Scanner;

public class GuessNumber1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guessedNumber = 99;
        int number ;

        do {
            System.out.println("Enter guessed the number from 1-200");
            number= scan.nextInt();

            if(number>guessedNumber && number<=200){
                System.out.println("Number is too high");
            }else if(number<guessedNumber && number>=1){
                System.out.println("Number is too low");
            }else{
                System.out.println("Please enter valid number");
            }
        }while (number!=guessedNumber);

        System.out.println("You guessed correct");






    }
}
