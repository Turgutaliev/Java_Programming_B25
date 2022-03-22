package day23_loops;

import java.util.Scanner;

public class PalindmoreTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name= scan.nextLine();
        String str="";
        for(int i=str.length()-1;i>=0;i--){
            name+=(str.charAt(i));

        }if (name.equals(str)){
            System.out.println("the word " + str + " is palindrome");

        }else {
            System.out.println("the word " + str + " is not a palindrome");


        }
    }
}
