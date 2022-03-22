package day28_array;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad"};

        //Do we have jackets in stock?

        // use Scanner to ask which item they are looking for, and check if we have it

        Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking for");
        String lookingFor = input.nextLine();
        boolean inStock = false;

        for(int i = 0; i < items.length; i++){

            if(items[i].equalsIgnoreCase(lookingFor)){
                inStock = true;
                break;
            }

        }

        System.out.println(lookingFor + (inStock ? " in stock" : " out of stock"));
            }

        }



