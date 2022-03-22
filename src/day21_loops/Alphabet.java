package day21_loops;

public class Alphabet {
    public static void main(String[] args) {
        char uppercaseBack = 'A';

        while (uppercaseBack<='Z'){
            System.out.print(uppercaseBack);
            uppercaseBack++;
        }

        System.out.println();
        char lowerCase = 'z';
        while (lowerCase>='a'){
            System.out.print(lowerCase);
            lowerCase--;
        }
    }
}
