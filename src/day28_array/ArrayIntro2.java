package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] arr = new double[4];
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        arr[0] = 30.99;
        arr[1] = 12;
        arr[2] = 17.99;
        arr[3] = 15;
        System.out.println(Arrays.toString(arr));

        arr[2]= 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);

        arr = new double[5];
        System.out.println(Arrays.toString(arr));





    }
}
