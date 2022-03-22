package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What number you want ?");
        int monthNum = scan.nextInt();
        String[] months = {"January","February","March","April","May","June","July","August","September","Oct"};


        System.out.println(months[monthNum-1]);







    }
}
