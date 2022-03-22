package day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
//        String address = "127 Lauren dr Charlotte NC 28079";
//        String nameOfOwner = "Turgut Aliyev";
//        int numberOfUnit = 3;
//        double averageSizeOfUnit = 200;
//        double monthlyRent = 1695;
//        double washerDryer =


        String address, nameOfOwner , ownersPhoneNumber;
        int numberOfUnits , numberOfWasherAndDryer , lengthOfLease , totalNumberOfResidents , numberOfFloors,numberOfParkingSpots;
        double avgSizeOfUnit , monthlyRent , numberOfStars;
        boolean allowspet, hasPool, nearGasStation, hasBasement, unitsAvailable , hasAC, wheelChairAccessibility;

        System.out.println("Please enter your address");
        address = scan.nextLine();

        System.out.println("Name of the owner ? ");
        nameOfOwner = scan.nextLine();

        System.out.println("Please enter "+nameOfOwner+" phone number");
        ownersPhoneNumber = scan.nextLine();

        System.out.println("Please enter number of units");
        numberOfUnits = scan.nextInt();

        System.out.println("Please enter number of washer and dryers");
        numberOfWasherAndDryer = scan.nextInt();

        System.out.println("Please enter lenght of the lease ");
        lengthOfLease = scan.nextInt();

        System.out.println("Please enter total number of residence");
        totalNumberOfResidents = scan.nextInt();

        System.out.println("Please enter number of floors");
        numberOfFloors = scan.nextInt();

        System.out.println("Please enter number of parking spaces");
        numberOfParkingSpots = scan.nextInt();

        System.out.println("Please enter average size of the units");
        avgSizeOfUnit = scan.nextDouble();


        System.out.println("Does the apartment allow pets?");
        allowspet = scan.nextBoolean();

        System.out.println("Does the apartment have pool ?");
        hasPool = scan.nextBoolean();

        System.out.println("How much is Monthly rent?");
        monthlyRent = scan.nextDouble();






        double rateAfter3Years = monthlyRent * 0.9; // 10& discount
        double rateAfter6Years = monthlyRent * 0.8;
        int avgNumberOfResidentsPerUnit = totalNumberOfResidents/numberOfUnits;
        int avgNumberOfParkingSpotsPerUnit = numberOfParkingSpots/numberOfUnits;
        int avgNumberOfUnitsPerFloor = numberOfUnits/numberOfFloors;


        System.out.println(rateAfter3Years);
        System.out.println(rateAfter6Years);
        System.out.println(avgNumberOfParkingSpotsPerUnit);
        System.out.println(avgNumberOfResidentsPerUnit);
        System.out.println(avgNumberOfUnitsPerFloor);


//        System.out.println("Please enter ");









 }
}
