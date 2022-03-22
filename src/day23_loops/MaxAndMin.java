package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648 ;
        int min = 2147483647;


        int n=0;

        while (n<5){
            n++;
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if(number > max){
                max = number;
            }
            if( number< min){
                min=number;
            }




        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);







    }
}
