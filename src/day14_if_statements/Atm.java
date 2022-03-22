package day14_if_statements;

import java.util.Scanner;

public class Atm {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" Welcome to ATM \nPlease enter your card\nPlease type your pin code");
            int pinCode = input.nextInt();
            int expectedPin = 2354;
            int balance = 5000;


            boolean correctPinCode = pinCode == expectedPin;

            if(correctPinCode){
                System.out.println("Logged in succesfully");
                System.out.println("Select the option");
                System.out.println("1) Check the balance");
                System.out.println("2) Withdraw");
                System.out.println("3) Deposit");
                int option = input.nextInt();

                if (option == 1){
                    System.out.println("Your balance is: $" + balance);
                }else if(option == 2){
                    System.out.println("Please enter witdraw amoubt");
                    double withdrawAmount = input.nextDouble();
                    System.out.println("Your balance is: $" + (balance - withdrawAmount));
                }else if(option == 3){
                    System.out.println("Please select the type of deposit\n1) Cash\n2) Check");
                    double option2 = input.nextDouble();
                    System.out.println("Please enter the amount for deposit");
                    double depositAmount = input.nextDouble();
                    System.out.println("Your balance is: $" + (balance + depositAmount));
                }

            }else{
                System.out.println("Invalid pin code\nPlease try again");
            }


        }
    }

