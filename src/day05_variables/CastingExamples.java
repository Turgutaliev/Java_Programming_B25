package day05_variables;

public class CastingExamples {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne;

        System.out.println(numOne);
        System.out.println(numTwo);


        float numThree = 40;
        short numFour = (short) numThree;

        System.out.println(numThree);
        System.out.println(numFour);
    }
}
