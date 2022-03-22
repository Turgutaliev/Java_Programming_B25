package day31_arrays;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {

        //1
//        String [] a = {"listen"};
//        String [] b = {"silent"};
//
//        if (Arrays.equals(a,b)){
//            System.out.println("Is Anagram");
//        }else {
//            System.out.println("Is not anagram");
//        }

        //2
        String aa = "listen";
        String bb = "silent";

        char [] one = aa.toCharArray();
        char [] two = bb.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        if(Arrays.equals(one,two)){
            System.out.println("Anagram");
        }else{
            System.out.println("not anagram");
        }


        //System.out.println(Arrays.equals(one,two)? "Anagram": "Not ANagram");




    }
}
