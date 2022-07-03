package day07_UnaryOperators;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2020;
        boolean isLeapYear = year%4 <1;
        //                     0 < 1 ===> true

        int year1= 2021;
        boolean isLeapYear1 = year1%4 <1;

        System.out.println(year+" is leap year: "+isLeapYear);
        System.out.println(year1+" is leap year: "+isLeapYear1);

    }
}
