package day17_string_pool;

import java.util.stream.Stream;

public class StringMethods {
    public static void main(String[] args) {
        String name = "james";
        String name1 = "Turgut";
        boolean nameResult = name.equals("james");
        boolean name1Result = name1.equals("Turgut");

        //how to compare String values --> use .equals()

        System.out.println(name.equals("james"));
        System.out.println("cat".equals("dog"));
        System.out.println(name1.equals("Turgut"));

      /*  if(name1Result){
            System.out.println("His name is "+name1);
        }if(nameResult){
            System.out.println("His name is "+name);
        }*/

       System.out.println(name1.equalsIgnoreCase("turgut"));

        System.out.println(name1.length());
        String last = "today was fun";
        int lastBoolean = last.length();
        System.out.println(lastBoolean);


    }
}
