package day25_recap;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number");
        int num= scan.nextInt();
        boolean isPrime = num>=2;


        for (int i = 2; i < num; i++) {

            if(num % i ==0){
                isPrime = false;
                break;
            }

        }

        if(isPrime){
            System.out.println(num+ " is prime");
        }else {
            System.out.println(num+ " is not prime");
        }









    }
}
