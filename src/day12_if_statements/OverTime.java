package day12_if_statements;

import jdk.swing.interop.SwingInterOpUtils;

public class OverTime {
    public static void main(String[] args) {

        double hourlyRate = 20;
        double numberOfHours = 40;
        double netPay;

        if(numberOfHours>40){
            double overTimeHours = numberOfHours-40;
            netPay = 40*hourlyRate;
            netPay= netPay+overTimeHours*hourlyRate*1.5; // netPay += overTimeHours*hourlyRate*1.5;
            System.out.println(netPay);



        }else{
            netPay=numberOfHours*hourlyRate;
            System.out.println(netPay);
        }
        System.out.println(netPay);











    }
}
