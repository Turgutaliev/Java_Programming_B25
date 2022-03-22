package day31_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EqualsExample {
    public static void main(String[] args) {


        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = a;

        System.out.println(a==b);
        System.out.println(Arrays.equals(a,b));
        System.out.println(a==c);


        boolean same = Arrays.equals(a,b);

        int [] d = {3,2,1};

        System.out.println(Arrays.equals(a,d));

    }
}
