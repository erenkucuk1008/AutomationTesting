package day07_UnaryOperators;

public class PostPre {

    public static void main(String[] args) {

        //3 2 1 7

        int x=2;
        int y=x++;
        System.out.println(x); //3
        System.out.println(y); //2

        int q=2;
        System.out.println(q++); //2

        int w = 2;
        System.out.println(--w);

        int t = 8;
        int k=t--;
        System.out.println(k);

        System.out.println("==========================");

        int a = 1;
        int b = -a-- + a++ / -a-- * --a;
        //  b = -1   + 0   / -1   * -1 ;
        System.out.println(b);

        int f = 50;
        int g = --f + f++ + f-- + f++;
        //  g = 49  + 49  + 50  + 49 ;
        System.out.println(g);

        int X = 4;
        int Y = X * 4 - X++;
        //  Y = 4 * 4 - 4 ;
        System.out.println(Y);

        int num1 = 100;
        int num2 = - ++num1 * -num1-- / num1++ + --num1;
        //  num2 = - 101    * -101    / 100    +   100 ;
        //  num2 = 10201 / 100 + 100 ;
        //  num2 = 102.01(int 102) + 100; ===> 202
        System.out.println(num2);

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        //  W = -20  + -19  +  19 * 19 % 2;
        //  W = -20  + -19  + 361 % 2;
        //  W = -20  + -19  + 1; ==> -38
        System.out.println(W);

    }
}
