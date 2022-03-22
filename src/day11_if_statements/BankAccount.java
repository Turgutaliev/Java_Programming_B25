package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter balance:");
        double accountBalance = input.nextDouble();
        System.out.println("Your balance is :"+ accountBalance+"\nPlease enter withdraw amount");
        double withdraw = input.nextDouble();

        accountBalance -= withdraw;


       /* if(withdraw>=accountBalance){
            System.out.println("Account balance is negative");
            System.out.println("Account balance is : "+(accountBalance-withdraw));
            System.out.println("Overdraft fee is $100");
           }else{
            System.out.println("Account balance is : "+(accountBalance-withdraw));
        }*/


        if (accountBalance <= 0) {
            System.out.println("Account balance is negative");
            System.out.println("Account balance is : " + accountBalance);
            System.out.println("Overdraft fee is $100");
            accountBalance-=100;
        }

            System.out.println("Account balance after fee applied : " + accountBalance);


    }
}
