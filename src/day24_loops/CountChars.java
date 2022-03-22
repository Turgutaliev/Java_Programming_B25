package day24_loops;

public class CountChars {
    public static void main(String[] args) {

        String word = "2juMp476wjsjJJSK";
        int upper = 0;
        int lower = 0;
        int number= 0;


        for (int i = 0; i < word.length(); i++) {

          char letter = word.charAt(i);

          if(letter>='A' && letter<='Z'){
              upper++;
          }else if(letter>='a' && letter <='z'){
              lower++;
            }else if (letter>='0' && letter<='9'){
              number++;
            }


        }

        System.out.println("Upper letters: "+upper);
        System.out.println("Lower letters: "+lower);
        System.out.println("Numbers: "+number);





    }
}
