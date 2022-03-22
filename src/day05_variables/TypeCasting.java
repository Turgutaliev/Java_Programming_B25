package day05_variables;

public class TypeCasting {
    public static void main (String []args){

        byte b= 40;
        int i = b; // the byte value is automaticly converted to int, because byte us smaller than int

        int i2 = 100;
        byte b2= (byte) i2; // int is bigger than byre ,so we must cast . We cast the int type - i2 to the byte type using (byte )


        int i3 = 500;
        long l1 = i3 ; // int is smaller thank long, so it will automaticly cast


        long l2 =200;
        int i4 = (int )l2; // im trying to go from long to int. long is bigger than int , so I must cast it


        long l3 = 100000000000000L;


        double d =50;
        int i5 =(int) d; //trying to go from double type to int type , double is bigger. I need to cast






        System.out.println(d);
        System.out.println(i5);





    }
}
