package day29_array;

public class LongestAndShortestString {
    public static void main(String[] args) {
        String [] name = {"apple", "java", "computer", "water"};
        String smallest = name[0]; //"apple"
        String biggest = name[0]; //"apple"

//        for (int i = 0; i< name.length; i++) {
//
//            if (name[i].length() > biggest.length()) {
//                biggest = name[i];
//            }
//
//            if (name[i].length() < smallest.length()) {
//                smallest = name[i];
//            }
//        }


        for(String word : name){

            if(word.length() > biggest.length()){
                biggest = word;
            }

            if(word.length() < smallest.length()){
                smallest = word;
            }

        }

        System.out.println("Biggest String: " + biggest);
        System.out.println("Smallest String: " + smallest);

            System.out.println("Biggest String is : "+biggest);
            System.out.println("Smallest String is : "+smallest);

        }







    }

