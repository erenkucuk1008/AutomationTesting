package day07_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 100;
        boolean isPositive = a>0;//verify if it is a positive
        boolean isNegative = a<0;//verify if it is a negative

        System.out.println(a+" is positive number: "+isPositive);
        System.out.println(a+" is negative number: "+isNegative);

        int b = -100 -20;
        System.out.println(b);

        int c = 10 - -20;
        System.out.println(c); // 10 + 20 = 30

        System.out.println("==============================================");

        //PRE
        int x = 100;
        ++x;
        System.out.println(x);//101

        int y = 100;
        --y;
        System.out.println(y);//99

        int z = 100;
        System.out.println(--z); // 99

        int x2= 100;
        System.out.println(++x2);// 101

        System.out.println("==============================================");

        //POST
        int q = 100;
        System.out.println(q++); //100
        System.out.println(q); //101

        int w = 100;
        //System.out.println(--w);
        System.out.println(w--);
        System.out.println(--w);


    }
}
