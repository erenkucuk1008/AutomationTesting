package day20_WhileLoops;

import java.util.Scanner;

public class Faktoriyel_Hesap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int result = 1;
        for (int i=num; i>=1; i--){
            result *= i;
        }
        System.out.println(result);
    }
}
