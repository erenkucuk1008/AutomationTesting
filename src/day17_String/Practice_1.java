package day17_String;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {

        /*
        write a program that ask user first name and last name and then show up initials!
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        char firsLetter = firstName.charAt(0);

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        char lastNameFirstLetter = lastName.charAt(0);

        System.out.println("=================================");

        System.out.println(firsLetter+""+lastNameFirstLetter);
        String fullName = firstName+" "+lastName;
        int lengthFullName = fullName.length() -1;
        char lastChar = fullName.charAt(lengthFullName);
        System.out.println(lastChar);

        System.out.println("=================================");
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println(upperCaseFullName);
    }
}
