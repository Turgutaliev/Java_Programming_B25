package day13_if_statements;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int oxygenLevel = scan.nextInt();

        if(oxygenLevel>=90){     //(oxygenLevel>90)
            System.out.println("Full Tank");
        }else if(oxygenLevel<=90 && oxygenLevel>=80){ //(oxygenLevel>80)
            System.out.println("Still Ok");
        }else if(oxygenLevel<=80 && oxygenLevel>=70) {//(oxygenLevel>70)
            System.out.println("Don't go too far");
        }else if(oxygenLevel<=70 && oxygenLevel>=60) {//(oxygenLevel>60)
            System.out.println("Start to head back");
        }else if(oxygenLevel<=60 && oxygenLevel>=50){//(oxygenLevel>50)
            System.out.println("Be careful now you at 50%");
        }else{
            System.out.println("Dangerous!!!");
        }


        System.out.println("----------------------------");

        String message;

        if(oxygenLevel>90){
            message="Tank is Full";
        }else if(oxygenLevel>80){
            message="Still ok";
        }else if(oxygenLevel>70){
            message="Don't go too far";
        }else if(oxygenLevel>60){
            message="Start head to back";
        }else if(oxygenLevel>=50){
            message="Be careful now you at 50%";
        }else{
            message="Dangerous";
        }
        System.out.println(message);








    }

}
