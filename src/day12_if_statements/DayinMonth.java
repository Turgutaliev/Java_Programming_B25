package day12_if_statements;

import java.util.Scanner;

public class DayinMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        boolean has31Days = month==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12;
        boolean has30Days=  month==4|| month==6 || month==9 || month == 11;
        boolean has28Days= month == 2;

        if (has31Days){
            System.out.println("31 Days");
        }
        if(has30Days){
            System.out.println("30 Days");
        }
        if(has28Days){
            System.out.println("28 Days");
        }else if (has28Days) {
            System.out.println("28 Days");
        }
    }
}
