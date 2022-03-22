package day33_methods;

import java.util.Scanner;

public class Age {
    public static void age(int birthyear ){
        System.out.println("Your birthyear is saved as "+birthyear);
        System.out.println("Your age is : "+(2022-birthyear));
    }



    public static void main(String[] args) {
        age(1992);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birth year:");
        int age = scanner.nextInt();
//        System.out.println("Please enter current year:");
//        int currentYear = scanner.nextInt();
//        age(currentYear);
        age(age);
    }


}
