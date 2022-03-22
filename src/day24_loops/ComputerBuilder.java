package day24_loops;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 100;


        System.out.println("Enter screen size");
        double screenSize = scan.nextDouble();

        if(screenSize==13.3){
            totalPrice+=200;
        }if(screenSize==15.0){
            totalPrice+=300;
        }if(screenSize==17.3){
            totalPrice+=400;
        }else{
            System.out.println("Wrong input");
        }
        System.out.println(totalPrice);
        System.out.println("Select the CPU\n\t1)i3\n\t2)i5\n\t3)i7");
        scan.nextLine();
        String cpu = scan.nextLine();
        switch (cpu){
            case "i3":
            totalPrice+=150;
            break;
            case "i5":
                totalPrice+=150;
                break;
            case "i7":
                totalPrice+=150;
                break;
            default:
                System.out.println("Enter valid CPU options");
        }

        System.out.println(totalPrice);
        String choosedRam="";
        System.out.println("Select the Ram\n\t4Gb\n\t8Gb\n\t16Gb\n\t32Gb");
        String ram= scan.nextLine();

        switch (ram) {
            case "4Gb":
                totalPrice += 50;
                choosedRam="4GB";
                break;
            case "8Gb":
                totalPrice += 100;
                choosedRam="8GB";
                break;
            case "16Gb":
                totalPrice += 150;
                choosedRam="16GB";
                break;
            case "32Gb":
                totalPrice += 200;
                choosedRam="32GB";
                break;
            default:
                System.out.println("Enter valid Ram options");
        }
        System.out.println(choosedRam+" "+totalPrice);
        System.out.println("Enter storage type \n\t1)SSD\n\t2)HDD" );
        String storageType = scan.nextLine();

        switch (storageType){

            case "SSD":
                System.out.println("Select SSD storage size \n\t1)500Gb\n\t2)1000Gb\n\t3)1500Gb\n\t4)2000Gb");
                String storageSizeSSD = scan.nextLine();
                switch (storageSizeSSD){
                    case "500Gb":
                        totalPrice += 100;
                        break;
                    case "1000Gb":
                        totalPrice += 200;
                        break;
                    case "1500Gb":
                        totalPrice += 300;
                        break;
                    case "2000Gb":
                        totalPrice += 400;
                        break;
                    default:
                        System.out.println("Enter valid SSD Storage options");
                }break;
            case "HDD":
                System.out.println("Select HDD storage size \n\t1)500Gb\n\t2)1000Gb\n\t3)1500Gb\n\t4)2000Gb");
                String storageSizeHDD = scan.nextLine();
                switch (storageSizeHDD){
                    case "500Gb":
                        totalPrice += 50;
                        break;
                    case "1000Gb":
                        totalPrice += 100;
                        break;
                    case "1500Gb":
                        totalPrice += 150;
                        break;
                    case "2000Gb":
                        totalPrice += 200;
                        break;
                    default:
                        System.out.println("Enter valid HDD Storage options");
                }

        }

        System.out.println("Enter screen resolution \n\t1)FULLHD\n\t2)4K");
        String screenResolution = scan.nextLine();

        switch (screenResolution){
            case "FULLHD":
                totalPrice+=100;
                break;
            case "4K":
                totalPrice+=200;
                break;
            default:
                System.out.println("Please select one of these options FullHD or 4K");
        }

        System.out.println("Laptop priceis: $"+totalPrice);
















    }
}
