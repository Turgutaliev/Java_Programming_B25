package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        System.out.println("Enter first name");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine().toUpperCase();
        System.out.println("Enter last name");
        String lastName = scan.nextLine().toUpperCase();

        System.out.print(""+firstName.charAt(0)+lastName.charAt(0));
        //System.out.println(lastName.charAt(0));




    }
}
