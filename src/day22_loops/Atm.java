package day22_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to ATM");

        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do {
            System.out.println("Please enter pin");
            userPin = scan.nextInt();
            attempts++;

        }while (validPin != userPin && attempts<3);

        if (validPin==userPin){
            System.out.println("Logged in");
        }else {
            System.out.println("Get out of here");
        }







    }
}
