package day32_LocalDate_WrapperClass;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ParseMethods {

    public static void main(String[] args) {

        String data = "123";
        //System.out.println(data+3);

        int num1 = Integer.parseInt(data); // none
        //                  primitive <==== primitive int

        Integer num2 = Integer.parseInt(data); // Autoboxing
        // wrapper class <=== primitive

        System.out.println(num1+3);
        System.out.println(num2+4);

        String s1 = "Hello";
        //int num3 = Integer.parseInt(s1);
        //System.out.println(s1);

        String s2 = "2.5";
        double d1 = Double.parseDouble(s2); // none
        //             primitive <=== primitive
        Double d2 = Double.parseDouble(s2);// autoboxing
        //             wrapper <== primitive
        System.out.println(d1+1);
        System.out.println(d2);

        String s3 = "Maybe";
        boolean b1 = Boolean.parseBoolean(s3); // none
        Boolean b2 = Boolean.parseBoolean(s3); // autoboxing

        System.out.println(b1); // default value of boolean is False

        String s4 = "False";
        boolean b3 = Boolean.parseBoolean(s4);
        System.out.println(b3); // not case sensitive

    }
}
