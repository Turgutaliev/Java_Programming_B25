package day10_scanner;

import java.awt.image.TileObserver;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Product name ");
        String productName = input.nextLine();
        System.out.println("Please enter price of the "+ productName);
        double productPrice = input.nextDouble();
        System.out.println("How many "+productName + "'s do you want to buy?");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("What is the full name of the order ?" );
        String fullName = input.nextLine();

        double totalCost = productPrice+ quantity;

        String order = fullName + ", your order for "+quantity+ " "+ productName+" has placed. Your total is $ "+totalCost;
        //System.out.println("Hello "+ fullName +", your order total price is $:"+(productPrice*quantity)+" tax");


        System.out.println(order);










    }
}
