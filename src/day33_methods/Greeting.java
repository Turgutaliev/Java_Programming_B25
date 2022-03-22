package day33_methods;

import java.util.Scanner;

public class Greeting {
    public static void hello(String name){
        System.out.println("Hello "+ name+ ", How are You?");
    }

    public static void main(String[] args) {
        hello("Turgut");
        hello("John");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        hello(name);






    }
}
