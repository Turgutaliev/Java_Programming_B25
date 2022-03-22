package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int num = 2;

        while(num<=100){

            System.out.println(num);
            num+=2;
        }

        //approach 2:

        int i =1;

        while (i <= 100){
            if (i%2==1){
                System.out.println(i);
            }
            i++;
        }


        int w = 1;

        while (w<=100){
            System.out.print(w + " ");
            w+=2; // a=a+2;

        }

        System.out.println("Hello");

        int b =0 ;

        while (b++<100){

            if (b%2==1){
                System.out.print(b+" ");
            }
        }




         /*

        print all the even numbers from 1 to 100, on separate lines

        print all the odd numbers from 1 to 100, but all in one line with spaces between each number


     */


            int n = 2;

            while(n <= 100){
                System.out.println(n);
                n += 2;
            }

            System.out.println();
            // approach 2:

            int x = 1;

            while(x <= 100){

                if(x % 2 == 0){
                    System.out.println(x);
                }
                x++;
            }

            System.out.println();


            // odd numbers

            int a = 1;

            while(a <= 100){
                System.out.print(a + " ");
                a += 2; // a = a + 2;
            }

            System.out.println();
            // approach 2

            int d = 0;

            while(d++ < 100){
                if (d % 2 == 1) {
                    System.out.print(b + " ");
                }
            }

        /*
            flow:
            b = 0
            b++ <= 100 --> 0 <= 100 --> loop runs and b increments to 1
             if (b % 2 == 1) --> 1 % 2 == 1 --> true -> prints number

             while(b++ <= 100) --> 1 <= 100 --> loop runs and b increments to 2
             if (b % 2 == 1) --> 2 % 2 == 1 --> false -> nothing happens

              while(b++ <= 100) --> 2 <= 100 -> loop runs and b increments to 3
         */


        }
    }


