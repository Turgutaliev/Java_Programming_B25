package day07_unary_operators;

import java.sql.SQLOutput;
import java.util.function.ToDoubleBiFunction;

public class ParkingLot {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("2 cars drive into parking lot");
        // approach 1

        cars = cars+2;
        System.out.println(cars);


        System.out.println("2 more cars drive in");

        //approach 2
        cars++;
        cars++;

        System.out.println(cars);

        System.out.println("6 cars left");

        cars = cars-5;
        System.out.println(cars);






    }
}
