package day16_review;

import java.util.Scanner;

public class AndroidVersion {
        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                String version = input.nextLine();


                String versionName="";
                switch (version){
                        case "1.5":
                                versionName="Cupcake";
                                break;
                        case "1.6":
                                versionName="Donut";
                                break;
                        case "2.1":
                                versionName="Eclair";
                                break;
                        case "2.2":
                                versionName="Froyo";
                                break;
                        case "2.3":
                                versionName="Gingerbread";
                                break;
                        case "3.1":
                                versionName="Honeycomb";
                                break;
                        case "4.0":
                                versionName="Ice Cream Sandwich";
                                break;
                        case "4.1":
                                versionName="Jelly Bean";
                                break;
                        case "4.4":
                                versionName="KitKat";
                                break;
                        case "5":
                                versionName="lolipop";
                                break;
                        case "8.0":
                                versionName="Oreo";
                                break;
                        case "9.0":
                                versionName="Pie";
                                break;
                        default:
                                versionName="Not a valid version";
                                break;
                }

                System.out.println(versionName);








        }
        }
