package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature: ");
//         double enteredTemp = input.nextDouble();
//         boolean temperature = enteredTemp>=70;
//         if(temperature){
//             System.out.println("Its Nice day");
//         }else{
//            System.out.println("Its cold");

            double enterTemp = input.nextDouble();
            if ( enterTemp>=70){
                System.out.println("It is a nice day");
                System.out.println("Go outside , but with your laptop to code java");
        }else{
                System.out.println("code Java at home");
                System.out.println("Code more Java");
            }

    }
}
