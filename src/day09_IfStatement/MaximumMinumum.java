package day09_IfStatement;

public class MaximumMinumum {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 30;

        boolean num1Max = num1 > num2;
        boolean num2Max = num2 > num1;

        if (num1Max){
            System.out.println(num1+" is maximum number");
        }

        if (num2Max){
            System.out.println(num2+" is maximum number");
        }

        System.out.println("========================");

        int n1 = 20;
        int n2 = 20;

        boolean equal = n1 == n2;

        if (equal){
            System.out.println("Both numbers are equal");
        }

        System.out.println("========================");

        boolean num1Min = num1 < num2;
        boolean num2Min = num2 < num1;

        if (num1Min){
            System.out.println(num1+" is minumum number");
        }

    }
}
