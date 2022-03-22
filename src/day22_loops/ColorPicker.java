package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int colorsPicked = 0;
        String uniqueColors = "";


        while (colorsPicked<3){

            System.out.println("What color");
            String color = scan.nextLine();
            colorsPicked++;

            uniqueColors+=color + " ";
            if (uniqueColors.contains(color)){
                System.out.println("you have already this color");
            }else{
                uniqueColors+= color + " ";
                colorsPicked++;

            }

        }
        System.out.println(uniqueColors);

    }
}
