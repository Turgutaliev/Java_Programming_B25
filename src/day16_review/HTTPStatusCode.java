package day16_review;

import java.util.Scanner;

public class HTTPStatusCode {
    public static void main(String[] args) {
        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();



        String statusMessage = "";
        switch (status){
            case 200:
                statusMessage="OK";
                break;
            case 201:
                statusMessage="Created";
                break;
            case 202:
                statusMessage="Accepted";
                break;
            case 307:
                statusMessage="Temprorary Redirect";
                break;
            case 400:
                statusMessage="Bad Request";
                break;
            case 404:
                statusMessage="Not Found";
                break;
            case 410:
                statusMessage="Gone";
                break;
            case 500:
                statusMessage="Interval Server Error";
                break;
            case 303:
                statusMessage="Service Unavailable";
                break;
            default:
                statusMessage="Invalid status code";
                break;
        }


        System.out.println(statusMessage);








    }
}
