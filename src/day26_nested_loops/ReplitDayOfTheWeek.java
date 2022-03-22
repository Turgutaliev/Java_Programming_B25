package day26_nested_loops;

import java.util.Scanner;

public class ReplitDayOfTheWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter day number:");
        int day = scan.nextInt();
        String message = "";

        if(day==1){
            message="Monday";
        }if (day == 2) {
            message="Tuesday";
        }if (day ==7){
            message="Sunday";
        }else{
            message="Invalid day";
        }
















        /*switch (day){
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
            default:
                message= "Not a valid day";*/

        System.out.println(message);






    }
}
