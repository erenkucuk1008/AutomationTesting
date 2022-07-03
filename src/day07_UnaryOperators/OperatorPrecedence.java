package day07_UnaryOperators;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int x = 2 + 3 * 2 / 1;
        System.out.println(x);

        int y = (2+3)*5;
        System.out.println(y);

        int z = 78/2+5-2*4;
        System.out.println(z);

        // matematiksel siralamaya gore islem yapilir.
        //parantez isleri oncelikli
        //carpma ve bolme ilk yapilir, sonra toplama ve cikarma yapilir
    }
}
