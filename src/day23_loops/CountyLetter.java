package day23_loops;

public class CountyLetter {
    public static void main(String[] args) {

        String word = "banana";
        int count = 0;
        char str = 'a';

        for (int i = 0; i <= word.length()-1; i++) {

            if (word.charAt(i) == str){
                count++;
            }



        }
        System.out.println(count);

        }









    }

