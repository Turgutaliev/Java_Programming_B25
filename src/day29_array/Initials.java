package day29_array;

public class Initials {
    public static void main(String[] args) {
        String [] name = {"James Bond","Eve Rell","Anna Johnson"};


        for (int i = 0; i < name.length; i++) {

            String fullName = name[i];
            String lastName = fullName.substring(fullName.indexOf(" ")).trim();
            String firstName = fullName.substring(0, fullName.indexOf(" ")).trim();
            System.out.println(""+firstName.charAt(0)+lastName.charAt(0));

        }

        System.out.println();


        for (String str : name) {

            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim();
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));

        }




    }
}
