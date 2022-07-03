package day15_Scanner;

import java.util.Scanner;

public class Personal_Info {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();
        System.out.println("Enter your favorite number");
        long number = scan.nextLong();
        System.out.println("Are you a student - true or false ");
        boolean student = scan.nextBoolean();

        System.out.println("Your age is: "+age);
        System.out.println("Your favorite number is: "+number);
        System.out.println("You are a student: "+student);
    }
}
