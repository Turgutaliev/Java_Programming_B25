package day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reverse+=str.charAt(i);

        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }











    }
}
