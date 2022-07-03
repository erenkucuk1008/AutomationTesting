package day32_LocalDate_WrapperClass;

public class ValueOfMethod {

    public static void main(String[] args) {

        String s1 = "123";

        int num1 = Integer.valueOf(s1); // unboxing
        // primitive <== wrapper class
        Integer num2 = Integer.valueOf(s1); // none

        System.out.println(num1+1);

        String s2 = "2.5";
        double d1 = Double.valueOf(s2); // unboxing
        // primitive <== wrapper
        Double d2 = Double.valueOf(s2); // none
        System.out.println(d1+1);

        String s3 = "False";
        boolean b1 = Boolean.valueOf(s3); // unboxing
        System.out.println(b1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
