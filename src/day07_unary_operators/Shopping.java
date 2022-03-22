package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("We pick up 1 Water");
        System.out.println("How many items in the cart: " + ++numberOfItems);
        System.out.println("Picked up 1 more Coca Cola ");
        System.out.println("How many items in the cart: " + ++numberOfItems);
        price = price+2.5;

        System.out.println("We picked up 2 eggs");
        System.out.println("How many items in the cart: " + (++numberOfItems +2));
        System.out.println("How many items in the cart: " + ++numberOfItems);

        System.out.println(numberOfItems++);
        System.out.println(++numberOfItems);



    }
}
