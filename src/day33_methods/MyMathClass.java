package day33_methods;

public class MyMathClass {
    public static void add(double numOne , double numTwo){
        System.out.println(numOne+ " + "+ numTwo+ " = "+ (numOne+numTwo));
    }

    public static void division(double numOne, double numTwo){
        if(numTwo != 0){
            System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
        } else {
            System.err.println("Cannot divide by 0");
        }
    }

    public static void multiply(double numOne, double numTwo){
        System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
    }


    public static void subtract(double numOne, double numTwo){
        System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
    }

    public static void main(String[] args) {
        add(200.99, 298.12);
        add(67.99, 99.99);


        division(100.99, 50.99);
    }


}
