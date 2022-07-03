package day15_Scanner;

import java.util.Scanner;

public class Scanner_Boolean {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a boolean - true or false");

        boolean bl = scan.nextBoolean();

        System.out.println("Value :"+bl);
        System.out.println("Opposite :"+!bl);
    }
}
