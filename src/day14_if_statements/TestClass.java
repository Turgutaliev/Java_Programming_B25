package day14_if_statements;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        inputs:
        declare and assign a 4 digit pin code
        declare and assign the last 4 digits of ssn: 1234

        declare and assign expected values for both
        example expected:
        pin: 1552
        ssn: 1234

        outputs:

        when the pincode and ssn match the expected print:
        Authentication successful

        when the pincode or ssn are not correct print:
        Authentication failed

        when the pincode was not correct print:
        incorrect pin code

        whent he ssn is not correct print:
        invalid ssn

*/
        System.out.println("Enter Pin");
        int pinCode = scan.nextInt();
        System.out.println("Enter SSN");
        int ssn = scan.nextInt();

        int expectedPin = 1552;
        int expectedSsn = 1234;
        String post;


        if (expectedPin==pinCode && expectedSsn == ssn){
            post ="Authentication successful";
        }if (expectedPin!= pinCode || expectedSsn!= ssn){
            post ="Authentication failed";

        }if (expectedPin!=pinCode){
            post ="incorrect pin code";
        }if(expectedSsn!=ssn){
            post = "invalid ssn";
        }else{
            post ="Thank you for using service";
        }


        System.out.println(post);









    }
}
