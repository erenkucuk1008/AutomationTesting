package day29_CustomMethods;

public class MethodPractice {

    public static void main(String[] args) {

        oddNumbers();
        System.out.println();
        evenNumbers();
    }

    public static void oddNumbers() {

        for (int i=1; i<=100; i+=2){
            System.out.print(i+" ");
        }
    }

    public static void evenNumbers() {
        for (int i=0; i<=100; i+=2){
            System.out.print(i+" ");
        }
    }
}
