package day09_scanner;
import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name : ");
        String fName = input.next();
        System.out.println("Enter last name : ");
        String lName = input.next();
        System.out.println("Are you employed ? ");
        boolean isEmployed = input.nextBoolean();
        System.out.println("Are you student ? ");
        boolean isStudent = input.nextBoolean();

        String details = fName+" "+lName +" is employed "+ isEmployed+" is student  "+ isStudent;

        System.out.println(details);


    }



}
