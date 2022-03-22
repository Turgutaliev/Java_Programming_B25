package day05_variables;

public class CharExamples {
    public static void main(String[]args){

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';
        char numberNine = '9';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);
        System.out.println(letterOne+letterTwo);
        System.out.println(numberNine);

        char letterThree = 65; //char letterThree = 'a';
        System.out.println(letterThree);

        System.out.println(letterOne+" "+letterTwo+" "+letterThree+" "+numberNine+" "+specialOne);

        System.out.println("chars: "+ letterOne+letterTwo+letterThree+numberOne+specialOne);//String in the beginning

        System.out.println(letterOne+letterTwo+letterThree+numberOne+specialOne); //math // original:97+90+65+57+36


    }
}
