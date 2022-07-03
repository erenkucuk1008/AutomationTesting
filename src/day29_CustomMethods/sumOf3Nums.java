package day29_CustomMethods;

import java.util.Scanner;

public class sumOf3Nums {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        sumOfThreeNumbers(22,33,44);
        sumOfThreeNumbers(scan.nextInt(), scan.nextInt(), scan.nextInt());
    }

    public static void sumOfThreeNumbers(int num1,int num2, int num3){

        System.out.println("Sum is: "+(num1+num2+num3));
    }
}
