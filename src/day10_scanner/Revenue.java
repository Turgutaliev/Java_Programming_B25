package day10_scanner;
import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter price :");
        double price = scan.nextDouble();

        System.out.println("Please enter quantity : ");
        int quantity = scan.nextInt();

        //double revenue = price * quantity;

        //System.out.println(revenue);
        //System.out.println("Store revenue is : "+(price*quantity));
        System.out.println("The revenue is : $"+(scan.nextDouble()* scan.nextInt()));


    }
}
