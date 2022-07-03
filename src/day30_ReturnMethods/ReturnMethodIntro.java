package day30_ReturnMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        System.out.println(addition(4,21));
        int sum = addition(4,21);
        int multiply = sum*3;
        System.out.println(multiply);
    }

    public static int addition(int n1, int n2){

        int n3 = n1+n2;
        return n3;
    }
}
