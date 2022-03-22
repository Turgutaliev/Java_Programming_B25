package office_hours_day04_02_23_2022;

public class P03_Ternary {
    public static void main(String[] args) {

        /*

        ? ---  if
        : ---  else

        condition ? true statemnets : false statements

  */


        int a = 15;
        int b = 10;

        System.out.println(a>b?a:b);

        System.out.println(" ======= SQUARE TASK WITH TERNARY =============");
        int x = 4;
        int y = 4;

        String result=(x==y)?"Square":"Rectangle";
        System.out.println("result = " + result);

        System.out.println(" ======= BMI TASK WITH TERNARY =============");

        double mass=82.4;
        double height=1.82;
        double BMI= mass/ (height*height);

        if(BMI<18.5){
            result="Underweight";
        }else if (BMI>=18.5 && BMI <25 ){
            result="Normal weight";
        }else if (BMI>=25 && BMI<30){
            result="Overweight";
        }else {
            result="Obese";
        }
        System.out.println(result);





    }
}

