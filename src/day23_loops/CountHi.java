package day23_loops;

public class CountHi {
    public static void main(String[] args) {
        String str = "bakuazerbaijan";
        int count = 0;

        for (int index = 0; index < str.length() ; index++) {

            if (str.charAt(index)=='a' && str.charAt(index+1)=='k'){

                count++;

                System.out.print(" "+str.substring(index, index));


            }


        }



    }
}
