package day15_switch_statements;

public class NumberWords {

    public static void main(String[] args) {

        int a = 5;

        if(a==1){
            System.out.println("one");
        }else if(a==2){
            System.out.println("two");
        }else if (a==3){
            System.out.println("three");
        }else if(a==4){
            System.out.println("four");
        }else if(a==5){
            System.out.println("five");
        }else{
            System.out.println("invalid");
        }



        // as switch statement

        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Invalid number");
                break;




        }


        System.out.println("Hello Turgut Abi");



    }


}
