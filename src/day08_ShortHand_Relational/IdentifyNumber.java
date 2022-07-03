package day08_ShortHand_Relational;

public class IdentifyNumber {

    public static void main(String[] args) {

        int num = 150;

        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isZero = num == 0;

        System.out.println(num+" is positive number :"+isPositive);
        System.out.println(num+" is negative number :"+isNegative);
        System.out.println(num+" is zero :"+isZero);

        System.out.println("==================================================");

        int angle1 = 30;
        int angle2 = 30;
        int angle3 = 90;

        int sum = angle1+angle2+angle3;

        boolean isValid = sum==180;

        System.out.println("The triangle is valid : "+isValid);

        System.out.println("=================================================");

        int number = 200;
        boolean isEven = number % 2 == 0;
        boolean isOdd = number %2 != 0;

        System.out.println(number+" is even number :"+ isEven);
        System.out.println(number+" is odd number :"+isOdd);

    }
}
