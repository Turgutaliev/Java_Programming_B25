package practice;

import java.util.Arrays;

public class QuizOne {
    public static void main(String[] args) {

//        char [] array = {'D', 'C', 'B','A'};
//        Arrays.sort(array);
//
//        for(char each : array){
//            System.out.println(each+" ");
//            if(each=='D'){
//                continue;
//            }
//        }



        int n = 0;
        String [] days = {"sun", "mon", "wed", "sat"};

        for (int i = 0; i < days.length; i++) {

            switch (days[i]){
                case "sat":
                case "sun":
                    n -=1;
                    break;
                case "mon":
                    n++;
                case "wed":
                    n+=2;
            }
        }
        System.out.println(n);


    }
}
