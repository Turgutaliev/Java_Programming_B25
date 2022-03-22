package day14_if_statements;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age to see age group");
        int age = scan.nextInt();
        String message = "";

        if (age<0 || age>120){
            message="Invalid age";
        }else if(age<=2){
            message="Baby";
        }else if(age>=3 && age<=5){
            message="Toddler";
        }else if(age>=6 && age<=9){
            message="Kid";
        }else if(age>=10 && age<=12){
            message="Pre-Teen";
        }else if(age>=13 && age<=17){
            message="Teenager";
        }else if(age>=18 && age <=20){
            message="Young adult";
        }else if(age>=21 && age<=35){
            message="Adult";
        }else if(age>=36 && age<=55){
            message="Middle-Aged Adult";
        }else if(age>55){
            message="Senior Citizen";
        }
        System.out.println(message);












    }
}
