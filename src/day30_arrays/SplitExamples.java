package day30_arrays;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {
        String s = "monday,tuesday,wednesday,saturday,sunday";
        String [] seperated = s.split(",") ;
        System.out.println(Arrays.toString(seperated));

        for(String day : seperated){
            System.out.println(day);
        }

        System.out.println();

        String [] seperateOne = s.split("day,");
        for (String withoutDay : seperateOne){
            System.out.println(withoutDay);
        }
        System.out.println();

        String str = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";

        String [] months = str.split("-");

        for (String each : months){
            System.out.println(each);
        }


    }
}
