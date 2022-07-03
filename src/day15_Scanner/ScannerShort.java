package day15_Scanner;

import java.util.Scanner;

public class ScannerShort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a short number:");
        short a = scan.nextShort();
        if (a>100){
            System.out.println("Your number "+a+" is greater than 100");
        }else {
            System.out.println("Your number "+a+" is smaller than 100");
        }

        System.out.println("Enter a new number: ");
        System.out.println("Your new number is :"+scan.nextShort());


    }
}
