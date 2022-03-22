package day14_if_statements;

import java.util.Scanner;

public class PinCodeSSN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter pincode");
        int actualPin = scan.nextInt();
        System.out.println("Please enter SSN");
        int actualSSN = scan.nextInt();
        int pin = 1998;
        int ssn = 3335;
        if(pin == actualPin && ssn ==actualSSN){
            System.out.println("Authentication successful");
        }else{
            System.out.println("authentication failed");
            if(actualPin!=pin){
                System.out.println("incorrect pin code");
            }if(actualSSN!=ssn){
                System.out.println("incorrect ssn");
            }
        }
    }
}
