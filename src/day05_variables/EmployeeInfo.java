package day05_variables;

public class EmployeeInfo {
    public static void main(String []args){

        String firstName = "Alex";
        String lastName = "Aliev";
        String gender ="man";
        int age = 29;
        String companyName = "Mega MC LLC ";
        boolean areTheFullTime = true;
        String jobTitle = "Developer";
        double salary = 49.90;
        byte pto = 18;
        boolean areTheyMarried = false ;
        char suite = 'D';


        System.out.println("Employee name : " +firstName+" "+lastName);
        System.out.println("Gender :"+gender);
        System.out.println("age:"+age);
        System.out.println("Company Name :" +companyName);
        System.out.println("Full Time Job ?-"+ areTheFullTime);
        System.out.println("Job Title :"+jobTitle);
        System.out.println("Salary :$"+ salary);
        System.out.println("PTO: "+pto);
        System.out.println("Married ? -"+areTheyMarried);
        System.out.println("Suite:"+suite);


    }
}
