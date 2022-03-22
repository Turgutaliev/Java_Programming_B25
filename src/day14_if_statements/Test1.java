package day14_if_statements;

public class Test1 {
    public static void main(String[] args) {
        String first = "Noah";
        String lastName ="Smith";
        String company = "Apple";
        int salary = 200000;
        int startDay =10;
        int startMonth =1;
        int startYear = 2022;
        boolean isFullTime = true;
        String title ="SDET";
        String officeAdress ="One Apple Park Way, Cupertino,CA 95014";
        String fullName = first + " "+lastName;
        String fullStartDate = startMonth + "/"+startDay+"/"+startYear;
        String email = first + startDay+ "@"+company+".com";
        double salary2Years =(int) salary+ salary*0.15;

        System.out.println("Employee Information");
        System.out.println("We have "+ fullName + " joining "+ company );
        System.out.println(first+" will start on "+ fullStartDate+" as full time: "+ isFullTime);
        System.out.println (first+" here is some information about your employment");
        System.out.println("Your email is "+ email);
        System.out.println("Your base salary is $" + salary+" and after 2 years it will be $"+ (int)salary2Years);
        System.out.println("Welcome aboard, see you at "+officeAdress);




    }
}
