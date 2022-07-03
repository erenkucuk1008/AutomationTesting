package day16_Scanner;

import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine(); // nextLine() oldugunda bosluklu birsey yazabiliriz.
                                            // scan.next() oldugunda bosluklu yazdigimizda direk sout yaziyor.
        System.out.println("Enter your last name:");
        String lastName = scan.next();

        System.out.println("Full name is : "+firstName+" "+lastName);


    }
}
