package day03_Variables;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        //score is 85
        byte score = 85;
        System.out.println(score);

        //  long number0=9999999999;
        // int is prefered, compiler takes it as an int, and the number 9999999999 is out of int' range

        long number1 = 9999999999L;

        double decimal1 = 0.5;
        // float float1= 0.5;
        //double is prefered for decimals, compiler takes it as double, is out of double' range
        float float2 = 0.5f;

        System.out.println(float2); //0.5

        /*
        for integers = int
        for decimals = double
         */

    }
}
