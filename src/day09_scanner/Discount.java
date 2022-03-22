package day09_scanner;

public class Discount {
    /*
    task:
    declare and assign
        is it the weekend
        are you a teacher
        are you a police officer
        are you a firefighter

        Do you get discount?
            Must be a weekend day and must be one of the given professions
     */

    public static void main(String[] args) {

        boolean isItTheWeekend = true;
        boolean areYouATeacher = true;
        boolean areYouAPolice = false;
        boolean areYouAFightFighter = false;
        //boolean getDiscount = isItTheWeekend && (areYouAFightFighter|| areYouAPolice || areYouATeacher) ;

        System.out.println(isItTheWeekend && (areYouAFightFighter|| areYouAPolice || areYouATeacher));











    }
}
