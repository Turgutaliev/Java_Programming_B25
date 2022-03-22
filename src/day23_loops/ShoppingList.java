package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String list = "Shopping List:";
        String addMore;

        do {
            System.out.println("Enter name of the item");
            list+= "\n*"+scan.nextLine();
            System.out.println("Do you want to add more ?");
            addMore = scan.nextLine();

        }while(addMore.equalsIgnoreCase("yes"));
        System.out.println("Thank you for shopping");
        System.out.println("Your order is : "+list);







    }
}
