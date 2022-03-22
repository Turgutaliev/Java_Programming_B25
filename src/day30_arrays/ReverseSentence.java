package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        /*

        Given a sentence
            today is monday

         reverse the sentence
            monday is today

     */


        String sentence = "today is monday";
        String [] words = sentence.split(" ");
        String reversedSentence = "";


        for (int i = words.length-1; i >=0; i--) {

            reversedSentence += words[i]+"";
        }

        System.out.println(reversedSentence.trim());









    }
}
