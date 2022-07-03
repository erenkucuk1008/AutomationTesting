package day21_Loops;

public class DoWhile {

    public static void main(String[] args) {

        int num = 1;

        do{
            System.out.print(num+" "); // 1 den 20 ye kadar yazdirir
            num++;
        }while (num<=20);

        System.out.println();

        System.out.println(num);  // 21

        System.out.println("=================================");

        char ch1 = 'Z';

        do {
            System.out.print(ch1+" ");
            ch1--;
        }while (ch1>='A');
    }
}
