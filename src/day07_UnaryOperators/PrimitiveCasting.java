package day07_UnaryOperators;

public class PrimitiveCasting {

    public static void main(String[] args) {

        short a = 3000;
        long b =a; // implicit casting
        // = 3000L

        //int c = b;
        // b is long and long is larger type than int.====> compiler error
        int d = a;

        double d1 = 200.5;
        int i1 = (int) d1;

        System.out.println(i1); // 200

        double d2 = 300;
        float f1 = (float) d2;

        System.out.println(f1); // 300.0

        System.out.println("============================================");

        short s2 = 400;
        byte b1 = (byte) s2; // -128 <= byte <=127
        System.out.println(b1); // the value is out of Byte range, and casting does not change the limit of data

        long l3 = 100;
        byte b2 = (byte) l3; // -128<= byte <=127
        long l4 = 1000;
        byte b3 = (byte) l4;

        System.out.println(b2);
        System.out.println(b3);

        float X = 30.097f;
        int C = (byte)X;
        System.out.println(C);



    }
}
