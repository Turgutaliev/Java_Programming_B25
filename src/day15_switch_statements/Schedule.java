package day15_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What day do you want to know about?");
        String day = input.next();
        String information = "";

        switch (day){
            case "Monday" : case "mon": case "Mon" : case "MONDAY":
            case "monday":
                information = "We have Java with Saim at 7 pm EST";
                break;
            case "tuesday":
            case "wednesday":
                information = "We have Java with Saim at 7 pm EST, but we also have office at 5:30";
                break;
            case "thursday":
                information = "We have soft skills with Nadir at 7 pm EST.";
                break;
            case "friday":
                information = "Today is day off, or as Nadir says soft skill studying day";
                break;
            case "saturday":
            case "sunday":
                information = "We have full day of java with Saim from 10 am est to 5 pm est";
                break;
            default:
                information = "Not a valid day";
        }

        System.out.println(information);

    }
}
