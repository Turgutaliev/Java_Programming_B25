package day16_review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade, attempt;
        System.out.println("What is the grade?");
        grade = scan.nextInt();
        System.out.println("Which attempt number is it");
        attempt = scan.nextInt();
        boolean validAttempts = attempt<4 && attempt>0;

        if (attempt==1){
            grade = grade-(int)(grade*0.1);
        }else if(attempt==2){
            grade = grade-(int)(grade*0.2);
        }else if(attempt==3){
            grade -= 0.65;
        }else{
            System.out.println("Not valid attempt number!");
        }

        if(validAttempts){
            System.out.println(grade);
        }









    }
}
