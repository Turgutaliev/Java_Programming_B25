package day22_loops;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean keepTalking = true;
        int num = 1;

        while(keepTalking){
            System.out.println("Enter a message "+num);

            String msg = scan.nextLine();
            num++;

            switch (msg){
                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are u?":
                    System.out.println("good");
                    break;
                case "bye":
                    System.out.println("Do not leave");
                    break;
                case "I should leave":
                    keepTalking=false;
                    break;
                default :
                    System.out.println("What you say bitch");



            }
        }
    }
}
