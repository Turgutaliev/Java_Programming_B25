package day21_loops;

public class MiddleChat {
    public static void main(String[] args) {

        String s = "abcde";


        if (s.length()%2 == 0){
            // our word is even lenhgth
        }else {
            // our word is odd length


            char middle = s.charAt(s.length()/2);
            System.out.println("With charAt: "+ middle);
            System.out.println("With substring: "+ s.substring(s.length()/2, s.length()/2+1));
        }




    }
}
