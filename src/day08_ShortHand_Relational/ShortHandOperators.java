package day08_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 10;
            a = 20;
        System.out.println(a);

            a = 30;
        System.out.println(a);

        String schoolName = "Cybertek";
        //String schoolName = "MIT";
               schoolName = "MIT";

        System.out.println(schoolName);

        int x = 100;
            x -= 68;
        System.out.println(x);// 32

        double salary = 100000;
        salary -= salary*0.28;
        System.out.println(salary);

        double balance = 2000;

               balance -= 380;
        System.out.println(balance);

               balance -= 1000;
        System.out.println(balance);

              // depositing
               balance += 350;
        System.out.println(balance);

        int y2 = 420 ;
            y2 += 1000 * 0.1;
        System.out.println(y2);

        String name = "Eren";
        name += " Kucuk";
        System.out.println(name);

        double totalTax = 100000;
        totalTax *= 0.28;
        System.out.println(totalTax);

        int bonus = 5000;
        bonus *= 2+1;
        System.out.println(bonus);

        int t = 10;
        t /= 5;
        System.out.println(t);

        int house = 500000;
        int monthly = 240;

        double monthlyPayment = 500000;
        monthlyPayment /= monthly;
        System.out.println(monthlyPayment);

        int num = 2000;
            num %= 2;

        System.out.println(num);




    }
}
