package day13_if_statements;

public class TornaryExamples {
    public static void main(String[] args) {

        int num = 4;
        String posOrNeg;
        if(num>0){
            posOrNeg="Positive";
        }else if(num<0){
            posOrNeg="Negative";
        }else{
            posOrNeg="zero";
        }
        System.out.println(posOrNeg);

        System.out.println("-----------------------------------");


        int num1 = -6;
        String sign = (num1>0) ? "positive": (num1<0) ?"negative": "zero";


        System.out.println(sign);

        System.out.println("--------------------------");


        int time =12;
        double price;

        if(time>=10 && time <= 15){ //15 means 3pm
            price =7.99;
        }else{
            price=10.99;
        }

        System.out.println(price);

        System.out.println("--------------------------");

        time = 19;

        double ternaryPrice = (time >=10 && time <= 15)? 7.99 : 15.99;

        System.out.println(ternaryPrice);
    }
}
