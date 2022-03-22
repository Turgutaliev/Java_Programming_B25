package day29_array;

import java.util.Arrays;

public class PrintArray1 {
    public static void main(String[] args) {
        int [] nums = {10, 14, -93, 140, -20};
        String str = "";

        for (int i = 0; i < nums.length; i++) {

            str = Arrays.toString(nums);

        }

        System.out.println(str);






    }
}
