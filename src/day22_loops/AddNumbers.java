package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = 1;
        int total = 0;

        while (num1 <= 5) {

            System.out.println("Enter number "+ num1);
            num1++;
            total+= scan.nextInt();
        }
        System.out.println(total);

    }
}
