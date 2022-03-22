package day31_arrays;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        String a = "abi";
        String b = "bia";

        char [] aa = a.toCharArray();
        char [] bb = b.toCharArray();

        Arrays.sort(aa);
        Arrays.sort(bb);

        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(bb));

        if (Arrays.equals(aa,bb)){
            System.out.println("is Anagram");
        }else {
            System.out.println("not Anagram");
        }



    }
}
