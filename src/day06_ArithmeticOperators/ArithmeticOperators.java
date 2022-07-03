package day06_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10/4); // int / int = int ----> 2
        System.out.println("10/4"); // text

        System.out.println(12 + 3.0); // int + double = double ----> 15.0
        System.out.println("12" + 3); // concatenation ---> 123

        System.out.println('a'+ 3); // addition, every single char has corresponding number
        //                 97 + 3

        System.out.println(12.0 / 4); // double / int = double  -----> 3.0

        double d  = 10/3.0;
        //     d = 3.3333

        System.out.println(d);

        // int num1 = 12.0 /4; it gives compiler error!! because 12.0 is a double. it should not int

        int num2 = 3/2;
        System.out.println(num2);

        double num3 = 3/2;
        System.out.println(num3);

        System.out.println("=========================================");

        System.out.println(100%13); // mod aliyoruz 100un 13 e bolumunden kalan sonuc oluyor..
        System.out.println(100%10);
        System.out.println(20%4.5);


    }
}
