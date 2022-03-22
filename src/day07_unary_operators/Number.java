package day07_unary_operators;

public class Number {
    public static void main(String[] args) {
        int number = 3984857;
        System.out.println("Original "+number++);
        System.out.println("Next four: ");
        System.out.println(number++);
        System.out.println(number++);
        System.out.println(number++);
        System.out.println(number++);
    }
}
