package day09_scanner;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Please enter number 1:");
//        int num1 = scan.nextInt();
//        System.out.println("Please enter number 2:");
//        int num2 = scan.nextInt();
//        System.out.println("Please enter number 3:");
//        int num3 = scan.nextInt();
//        System.out.println(num1+num2+num3);



        System.out.println("Please enter number 1:");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2:");
        int num2 = scan.nextInt();
        System.out.println("Please enter number 3:");
        int num3 = scan.nextInt();
        int sumAll = num1+num2+num3;
        System.out.println("Summary of all 3 :"+ sumAll);
    }



}
