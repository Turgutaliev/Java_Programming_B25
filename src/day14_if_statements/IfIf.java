package day14_if_statements;

public class IfIf {
    public static void main(String[] args) {
        double price = 29.99;
        boolean hasPrime = false;

        if(hasPrime){
            System.out.println("Eligible for regular free shipping");
        }else {

            if (price>=25){
                System.out.println("Regular Free Shipping");
            }else{
                System.out.println("Not eligible free shipping , Shipping cost is : $3.99");
            }



        }
    }
}
