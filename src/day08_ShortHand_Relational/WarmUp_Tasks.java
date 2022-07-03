package day08_ShortHand_Relational;

public class WarmUp_Tasks {

    public static void main(String[] args) {

        // 1 gallon : 3.785 liter

        double gallons = 100;
        double liter = gallons * 3.785;

        System.out.println(gallons+" gallons equal to "+liter+" liters");

        System.out.println("============================================");

        int kg =100;
        int pounds = (int) (kg * 2.20462);

        System.out.println(kg+" kg equals to "+ pounds+" pounds");

        System.out.println("============================================");

        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;
        //  b = -100 + 102 - 102 * 101 % 2;
        //  b = -100 +102 -(102*101) % 2;
        //  b = -100 +102 - 0;
        System.out.println(b); // 2
    }
}
