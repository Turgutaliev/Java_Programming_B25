package day19_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter url");
        String url = input.nextLine();
        //System.out.println("www."+url+".com");
        String website = url.substring(4, url.length()-4);
        System.out.println(website);

    }
}
