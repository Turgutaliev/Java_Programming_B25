package day15_switch_statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to vending machine . \nPlease select one of the following:\n\tDrinks\n\tSnacks\n\tGum");
        String selection = scan.nextLine();
        String item = "";

        switch (selection){
            case "Drinks":
                System.out.println("Please chose drinks : press number: \n\t1)Water\n\t2)Juice\n\t3)Soda");
                int numberDrink = scan.nextInt();
                if(numberDrink==1){
                    item="water";
                }else if(numberDrink==2){
                    item="Juice";
                }else if(numberDrink==3){
                    item="Soda";
                }break;
            case "Snacks":
                System.out.println("Please chose snacks : press number: \n\t1)Chips\n\t2)Cracks\n\t3)Jelly");
                int numberOfSnacks = scan.nextInt();
                if(numberOfSnacks==1){
                    item="chips";
                }else if(numberOfSnacks==2){
                    item="cracks";
                }else if(numberOfSnacks==3){
                    item="jelly";
                }break;
            case "Gum":
                System.out.println("Please chose gum : press number: \n\t1)Gum1\n\t2)gum2");
                int numberOfGum = scan.nextInt();

                if(numberOfGum==1){
                    item="Gum1";
                }else if (numberOfGum==2){
                    item="Gum2";
                }break;
            default:
                System.out.println("Wrong selection. I can't sell you anything. Get out of here!");

        }
        System.out.println("Vending ......"+item);




    }

}
