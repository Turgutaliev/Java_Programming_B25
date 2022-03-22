package day24_loops;

import java.util.Scanner;

public class QuizTest {
    public static void main(String[] args) {

        /*int i = 13-9/3*10;
        i+=10;
        System.out.println(i);
*/

/*
        boolean one = ('a' != 'z') && false;
        boolean two = one || 0== (9-10+1);

        System.out.println(two);



        long l =100;
        short s = (short) l;

        System.out.println(s+10);



        int a= 10;

        a= --a + a++ + a-- + a++;
        System.out.println(a);
        */


/*


        short s = 13+ 3*(10-6) %2;
        boolean b = s !=25;
        System.out.println(b);
*/

/*

        byte b = 104;
        boolean check = b<100;

        if (check){
            b-=100;
        }else{
            b=50;
        }
        System.out.println(b*/
/**//*
);
*/
/*

        if (183 == 13 + 50 * 2 + 70){
            System.out.println("Java");
        }else {
            System.out.println("soft skills");
        }
*/

/*

        String str = "";
        int num = 20;

                switch (num) {

                    case 0:
                        str = "s#";
                        break;
                    case 10:
                        str += "is";
                    case 15:
                        str = "fun";
                    case 20:
                        str +="java";
                    case 25:
                        str +="is";
                        break;
                    case 30:
                        str += "fun";
                        break;
                    case 35:
                        str = "python";
                    case 40:
                        str +="90";



                }
        System.out.println(str);


*/
/*


        double dec = 12.838;
        int whole = dec<20? 20:10;

        System.out.println(whole);
*/

      /* int check =123;
       String str = "";

       if (check % 2 == 0 ){
           str += check;
           if (check%5==0){
               str = "132";
           }else{
               str ="500";

           }
       }else {
           str += "123";
       }


        System.out.println(str);

*/
/*

        int num = 2;
        boolean b = true;

        switch (num){

            case 0:
                b = false;
            case 1:
                System.out.print(1);
            case 2:
                if (b) {
                    System.out.print (2);
                } else {
                    b = false;
                }
                    case 3:

                        if (b) {
                            System.out.print(3);
                            b = false;
                        }
                            else {
                            break;
                        }
                    case 4:
                        System.out.print(4);
                    case 5:
                        if (!b) {
                            break;
                        }
                        System.out.print (5) ;
        }

*/

        Scanner scan = new Scanner(System.in);
      /*  int one = scan.nextInt();
        int two = scan.nextInt();

        if (one -- > two * 2){
            System.out.println("one");
        }else{
            System.out.println(two);
        }*/

       /* byte b1 = scan.nextByte();
        byte b2 = scan.nextByte();

        int max =( b1>b2 )? b1+2: b2-4;

        System.out.println(max);

*/
        String first = scan.nextLine();
        String last = scan.nextLine();
        int number = scan.nextInt();

        String fullName = "";


        if (number%2==0){
            fullName= first+ " "+ last;
        }else {
            fullName = " Not Valid Name";
        }


        System.out.println(fullName);


    }
}
