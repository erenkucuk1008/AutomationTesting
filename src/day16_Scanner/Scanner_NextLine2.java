package day16_Scanner;

import java.util.Scanner;

public class Scanner_NextLine2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your business title");
        String title = scan.nextLine();

        System.out.println("Age is: "+age);
        System.out.println("Your phone number is: "+phoneNumber);
        System.out.println("Your full name is: "+fullName);
        System.out.println("Your title is: "+title);
    }
}
