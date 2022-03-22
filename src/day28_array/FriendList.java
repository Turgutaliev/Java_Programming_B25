package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you want to store");
        int size = input.nextInt();
        String[] friendlist = new String[size];

        for (int i = 0; i < friendlist.length; i++) {
            System.out.println("Enter friends name"+ i);
            friendlist[i] = input.next();
        }

        System.out.println(Arrays.toString(friendlist));


    }
}
