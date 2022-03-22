package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose a language: \n\t1-English\n\t2-Spanish\n\t3-Turkish\n\t4-Russian\n\t5-French");

        int option = scan.nextInt();
        String message;
        if (option == 1) {
            message = "Hello , thank you for call";
        } else if (option == 2) {
            message = "hola, gracias para llamar";
        } else if (option == 3) {
            message = "merhaba, aradiginiz ichin tesekkurler";
        } else if (option == 4) {
            message = "privet, spasibo za vash zvonok";
        } else if (option == 5) {
            message = "Merci ,pour votre appel";
        } else {
            message = "We will use English by default";
        }//else{
        // message="wrong selection";


        System.out.println(message);


}
}





//