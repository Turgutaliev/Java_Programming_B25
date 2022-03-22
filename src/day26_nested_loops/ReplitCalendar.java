package day26_nested_loops;

import java.util.Scanner;

public class ReplitCalendar {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();
        String monthName = "";


        //WRITE YOUR CODE BELOW:
        switch (monthNum){

                case 1:
                monthName = "January";
                break;
                case 2:
                monthName = "February";
                break;
                case 3:
                monthName = "March";
                break;
                case 4:
                monthName = "April";
                break;
                case 5:
                monthName = "May";
                break;
                case 6:
                monthName = "june";
                break;
                case 7:
                monthName = "july";
                break;
                case 8:
                monthName = "August";
                break;
                case 9:
                monthName = "September";
                break;
                case 10:
                monthName = "October";
                break;
                case 11:
                monthName = "November";
                break;
                case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";

        }

        System.out.println(monthName);

    }
}







