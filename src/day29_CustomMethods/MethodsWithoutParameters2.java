package day29_CustomMethods;

public class MethodsWithoutParameters2 {

    public static void main(String[] args) {

        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("Eren Kucuk");
        printHello5X();

        MethodsWithoutParameters2.printHello5X();

    }

//AccessModifier Specifier returnType MethodName (Parameter)
    public static void printHello5X() {

        for (int i=1; i<=5; i++){
            System.out.println("Hello World");
        }
    }
}
