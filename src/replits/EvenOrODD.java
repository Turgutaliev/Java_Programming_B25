package replits;

import com.sun.tools.javac.Main;

public class EvenOrODD {
    public static void main(String[] args) {

       /* Use a loop to print all the even numbers from 1 to 20. Print each number on the same line, with spaces between each

        Use another loop to print all the odd numbers from 1 to 20. Print each number on the same line, with spaces between each

        Note: In the end there will be two lines. First the line to show all the even numbers and then another line to show all the odd numbers

        Main topics: loops, primitive datatypes, if statement, operators

        Example Flow:

        2 4 6 .... 18 20
        1 3 5 .... 17 19
        */




        for (int num = 1; num <= 20; num++) {

            if (num % 2 ==0 ){

                System.out.print(num +" ");

            }

        }
        System.out.println();
        for (int num = 1; num <=20 ; num++) {
            if (num%2==1){
                    System.out.print(num+" ");

            }
        }




    }
}
