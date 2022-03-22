package day11_if_statements;

import java.util.Scanner;

public class CheckHungry {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("are you hungry?");
        boolean isHungry = scan.nextBoolean();

        if (isHungry){
            System.out.println("You are hungry , get some food");
        }else{
            System.out.println("great , Practice Java");
        }
    }
}
