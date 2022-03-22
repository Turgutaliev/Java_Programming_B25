package day10_scanner;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 3 angle numbers" );
        double angleOne = keyboard.nextDouble();
        double angleTwo = keyboard.nextDouble();
        double angleThree = keyboard.nextDouble();
        boolean isTriangle = angleThree+angleOne+angleTwo == 180;
        boolean isCircle = angleOne+angleTwo+angleThree==360;

        System.out.println("It is Triangle : "+ isTriangle);
        System.out.println("It is a Circle : "+ isCircle);

















    }
}
