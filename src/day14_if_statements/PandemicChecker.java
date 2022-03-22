package day14_if_statements;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number>=1346 && number<= 1353){
            System.out.println("The Black Death");
        }else if ( number >=1665 && number<=1666){
            System.out.println("Great Plague of London");
        }else if ( number >=1770 && number <= 1772){
            System.out.println("Russian Plague");
        }else if ( number >=1889 && number <= 1890){
            System.out.println("Flu pandemic");
        }else if ( number ==1916){
            System.out.println("American polio epidemic");
        }else if ( number >=1918 && number<=1920){
            System.out.println("Spanish Flu");
        }else if ( number >=2009 && number <=2010){
            System.out.println("H1N1 Swine Flu pandemic");
        }else if ( number >=2014 && number <=2016){
            System.out.println("West African Ebola epidemic");
        }else if ( number >=2020 && number <=2021){
            System.out.println("COVID=19");
        }else {
            System.out.println("No Pandemic");
        }








    }
}
