package day28_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // normal variables


        String cityOne = "Los Angeles";
        String cityTwo = "New York";
        String cityThree = "Charlotte";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";


        //declare array with values


        String [] cities = { "Baku", "New York", "Charlotte", "Denver","Pittsburgh"};

        //System.out.println(cities); // it does not print array how we want

        System.out.println(cities[3] +" "+ cities[4]);


        System.out.println("Reverse order of the cites "+cities[4]+ ", "+cities[3]+", "+cities[2]+", "+cities[1]+", "+cities[0]);

        // print the array all at one time
        System.out.println(cities); // this doesn't print the array how we want
        System.out.println(Arrays.toString(cities)); // this method from Arrays class lets you print the array fully

        // number of elements
        System.out.println(cities.length);


















    }
}
