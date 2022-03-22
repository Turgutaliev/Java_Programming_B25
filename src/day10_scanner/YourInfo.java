package day10_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter your favorite book ");
        String book = in.nextLine();
        System.out.print("What is your age? ");
        byte age = in.nextByte();
        System.out.print("What is your favorite number? ");
        long favoriteNumber = in.nextLong();

        System.out.println(book);
        System.out.println(age);
        System.out.println(favoriteNumber);
    }
}
