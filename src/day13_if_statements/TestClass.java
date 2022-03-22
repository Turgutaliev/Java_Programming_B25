package day13_if_statements;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int number1, number2, number3;

        System.out.println("Enter first number:");
        number1 = scan.nextInt(); // int number1 =1992;
        System.out.println("Enter second number:");
        number2 = scan.nextInt();
        System.out.println("Enter third number:");
        number3 = scan.nextInt();


        if(number1>number2 && number1<number3 || number1<number2 && number1>number3){
            System.out.println(number1);

        }else if(number2>number1 && number2<number3 || number2<number1 && number2>number3){

            System.out.println(number2);
        }else if(number3>number1 && number3<number2){
            System.out.println(number3);
        }else {
            System.out.println(number3);
        }
    }


    }

