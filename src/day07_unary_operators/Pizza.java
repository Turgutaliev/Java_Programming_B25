package day07_unary_operators;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "Cheese";
        int numberOfSlices = 10;
        int numberOfPeople = 4;
        int slicesPerPerson = numberOfSlices / numberOfPeople;
        int slicesLeftOver = numberOfSlices % numberOfPeople;

        String report = "We ordered "+typeOfPizza +" pizza with " + numberOfSlices + " slices . "+ numberOfPeople+ " people ate "+ slicesPerPerson+ " each with "+slicesLeftOver+ " left over";

        System.out.println(report);


    }
}
