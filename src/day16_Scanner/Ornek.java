package day16_Scanner;

import java.util.Scanner;

public class Ornek {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine(); // String e gecerken nextLine() vermemiz gerekiyor.!!

        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println(age);
        System.out.println(name);
    }
}
