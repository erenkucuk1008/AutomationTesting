package day31_MethodOverLoading;

public class MethodOverLoading2 {

    public static void main(String[] args) {

        System.out.println(sum(2,3,4));
        System.out.println(sum(1,2,314,44));
        System.out.println(sum(12,11));

        System.out.println(sum(5.3,5.5));

    }

    public static int sum(int a, int b){ return a+b; }

    public static int sum(int a, int b, int c){ return a+sum(b,c); }

    public static int sum(int a, int b, int c, int d){ return a+sum(b,c,d); }

    public static double sum(double a, double b){ return a+b; }

    public static double sum(double a, double b, double c){ return a+sum(b,c); }

    public static double sum(double a, double b, double c, double d){ return a+sum(b,c,d); }
}
