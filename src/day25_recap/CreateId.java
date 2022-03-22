package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Enter your last name");
        String lastName = scan.nextLine().toLowerCase(Locale.ROOT);

        String id = firstName.substring(0, 1);
        id += lastName.substring(0, 1).toUpperCase()+ lastName.substring(1,3);
        id += firstName.length()*2;

        System.out.println(id);



    }
}
