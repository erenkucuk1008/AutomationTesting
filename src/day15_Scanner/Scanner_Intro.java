package day15_Scanner;

import java.util.Scanner;

public class Scanner_Intro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int b = input.nextInt();
        System.out.println("That is the number that you enter : "+b);
    }
}
