package day17_string_pool;

public class StringMemory {
    public static void main(String[] args) {


        String first = "java"; // String literal , in String pool
        String second = new String("java");

        System.out.println(first==second);

        String third = "java";
        String fourth = "Java";

        System.out.println(first == third);
        System.out.println(first == fourth);

        System.out.println(second);





    }
}
