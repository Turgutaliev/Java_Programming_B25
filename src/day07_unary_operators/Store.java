package day07_unary_operators;

public class Store {
    public static void main(String[] args) {
        String store = "Target";
        int numberOfTvs = 100;

        System.out.println("Person comes into the store and they bought a TV");
        System.out.println("Number of TVs now: " + --numberOfTvs);

        System.out.println("Person comes into the store and they bought a TV");
        System.out.println("Number of TVs now: " + --numberOfTvs);

        System.out.println("Person comes into the store and they put TV into their cart");
        System.out.println("Number of TVs now: " + numberOfTvs--);
        System.out.println("person bought it and now store has "+ numberOfTvs + " TVs");


        System.out.println("I get a shipment");
        numberOfTvs = numberOfTvs+15;

        System.out.println(numberOfTvs);
    }
}
