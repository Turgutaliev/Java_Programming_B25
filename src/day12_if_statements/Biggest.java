package day12_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 1");
        int num2 = scan.nextInt();
        System.out.println("Please enter number 1");
        int num3 = scan.nextInt();

        boolean option1 = num1>=num2 && num1>=num3;
        boolean option2 = num2>=num1 && num2>=num3;
        boolean option3 = num3>=num1 && num3>=num2;

        if(option1){
            System.out.println(num1 +" is biggest");
        }else if(option2){
            System.out.println(num2 +" is biggest");
        }else if(option3){
            System.out.println(num3 +" is biggest");
        }
    }
}
