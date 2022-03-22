package day15_switch_statements;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        //int calories;
        /*System.out.println("Which drink you want");
        //float price = scan.nextFloat();
        String size = scan.nextLine();


        switch (size){
            case "tall":
                System.out.println("price is $2.30 and calories 100");
                break;
            case "grande":
            System.out.println("price is $4.00 and calories 150");
                break;
            case "venti":
            System.out.println("price is $4.50 and calories 200");
            break;
            default:
                System.out.println("Whong option");
        }*/

        System.out.println("Welcome to Starbucks , What size cofee would you like?");
        String size = scan.nextLine();
        double price = 0;
        int calories =0;
        boolean validOrder = true;

        switch (size){
            case "tall":
                price = 2.5;
                calories = 100;
                break;
            case "grande":
                price = 4.0;
                calories = 150;
                break;
            case "venti":
                price = 4.5;
                calories = 200;
                break;
            default:
                System.out.println("We don't have that size");
                validOrder = false;
        }
        if(validOrder){
            System.out.println("Your order for a " + size + " coffee is $" + price + " and has " + calories + " calories");
        }






    }
}
