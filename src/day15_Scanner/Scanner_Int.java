package day15_Scanner;

import java.util.Scanner;

public class Scanner_Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2");
        int num2 = scanner.nextInt();

        System.out.println("Number 1 is: "+num1);
        System.out.println("Number 2 is: "+num2);
        System.out.println("Sum is : "+(num1+num2));
    }
}
