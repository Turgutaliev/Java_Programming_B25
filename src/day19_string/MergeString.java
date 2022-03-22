package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter word 1");
        String one  = "abc";
        //System.out.println("Enter word 2");
        String two  = "xyz";
        String merged = "";

        merged = merged+ one.charAt(0); // merged +=one.charAt(0)
        merged = merged+ two.charAt(0);
        merged = merged+ one.charAt(1);
        merged = merged+ two.charAt(1);
        merged = merged+ one.charAt(2);
        merged = merged+ two.charAt(2);

        System.out.println(merged);
















    }
}
