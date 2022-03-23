package replits;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

        String [] strArr = str.split(", ");

        int shortestWord = strArr[0].length();


        for (String word : strArr){

            if (word.length()<shortestWord){

                shortestWord= word.length();

            }
        }

        String a = "";
        for (int i = 0; i < strArr.length; i++) {

            if(strArr[i].length()==shortestWord){
                a +=  strArr[i]+" ";//old cat ray
            }

        }
        String [] shortwords = a.split(" ");
        System.out.println(Arrays.toString(shortwords));








    }
}
