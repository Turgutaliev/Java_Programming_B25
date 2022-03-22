package day16_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number one");
        double num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please input opne of the fallowings : + , - , * , / , %");
        String option = scan.nextLine();
        System.out.println("Enter second number");
        double num2 = scan.nextDouble();
        double sum =0;
        boolean isValid = true;



        switch (option){
            case  "+":
            case "plus":
               sum = num1+num2;
               break;
            case "-":
            case "minus":
                sum = num1-num2;
                break;
            case "*":
            case "x":
                sum = num1*num2;
                break;
            case "/":
            case "divide":
                if (num2!=0){
                    sum=num1/num2;
                }else {
                    System.out.println("Can not divide by 0");
                    isValid=false;
                }
                break;
            case "%":
                if (num2 !=0){
                    sum = num1%num2;
                    break;
                }else{
                    System.out.println("Can not reminder by 0");
                    isValid=false;
                }
                break;
            default:
                System.out.println("Invalid operator");
                isValid = false;

        }

        //System.out.println("Result is "+ sum );

        if(isValid) {
            System.out.println(num1 + " " + option + " " + num2 + " = " + sum);
        }





    }
}
