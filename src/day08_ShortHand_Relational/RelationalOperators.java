package day08_ShortHand_Relational;

public class RelationalOperators {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        boolean r1 = num1>num2; // num1 greater than num2
        boolean r2 = num2>num1; // num2 greater than num1

        boolean r3 = num1<num2; // num1 less than num2
        boolean r4 = num2<num1; // num2 less than num1

        System.out.println(num1+" greater than "+num2+" :"+r1);
        System.out.println(num2+" greater than "+num1+" :"+r2);

        System.out.println(num1+" less than "+num2+" :"+r3);
        System.out.println(num2+" less than "+num1+" :"+r4);

        System.out.println("=================================================");

        System.out.println(10>10);
        System.out.println(10<=10);

        System.out.println(10<9);
        System.out.println(10<=9);

        System.out.println("=================================================");

        boolean b1 = 10 == 10; // denklik ==> aynisi mi ========> true
        boolean b2 = 10 != 10; // esit degil ==> ayni degil ====> false

        System.out.println(b1);
        System.out.println(b2);

        boolean b4 = "Muhtar" == "Java Teacher"; // false
        System.out.println(b4);

        boolean b3 ="Eren" != "Bad Guy"; // true
        System.out.println(b3);

        boolean b5 = "Eren" == "eren"; // false === E ve e aynisi degil
        System.out.println(b5);



    }
}
