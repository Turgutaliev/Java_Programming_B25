package day04_variables;

public class Fruits {
    public static void main(String[]argd){
        int apples =50;
        int grapes =100;
        int bananas = 150;

        System.out.println("This is how many apples we have :"+ apples);
        System.out.println("grapes :"+grapes);
        System.out.println("bananas :"+bananas);
        System.out.println("sold some apples");
        apples=25;
        System.out.println("Apples after selling:"+apples);
        System.out.println(apples+20);
        System.out.println(apples+","+grapes);

        int price = 15;

        System.out.println("The price of my "+ apples + " thais $"+price );



    }
}
