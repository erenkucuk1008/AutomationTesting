package day32_LocalDate_WrapperClass;

public class WrapperClassIntro {

    public static void main(String[] args) {

        byte b = 100;
        Byte b2 = b; // autoboxing

       // Integer b3 = (int) b;

        int i =10;
        //byte b3 = i;           wrapper class is only dedicated to its own primitives

        Integer I = 20;
        double d = I; // unboxing
        long l = I;
        float f = I;

        Integer num =100;
        //Long L1 = num;
        long L2 = num;  // unboxing

        System.out.println("======================");

        Character ch = 'A';
        char ch1 = ch; // unboxing
        int i1 = ch;   // unboxing

        long score = 80;
        Long ss = score; // autoboxing
        Long d3 = ss; // none

        double d4 = score; //none

    }
}
