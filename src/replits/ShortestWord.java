package replits;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String[] strArr = str.split(", ");

        int shortest = strArr[0].length();

        for (String each : strArr) {

            if (each.length()<shortest){
                shortest=each.length();
            }

        }

        String word="";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length()==shortest){
                word= word+strArr[i]+" ";
            }
        }

        String [] shortWords = word.split(" ");
        System.out.println(Arrays.toString(shortWords));



    }

}
