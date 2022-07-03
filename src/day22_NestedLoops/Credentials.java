package day22_NestedLoops;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String userName = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        int attempt = 1; // 3 sans vermek icin 1 girdik.  1---2---3 and then locked
        // eger 1 kerede verilerin dogru girilmesini istersek if(attemp==1)

        while (!(userName.equals("Cyber") && password.equals("Cyber123"))){

            if (attempt>2){
                System.out.println("Your account locked");
                System.exit(0);
            }

            System.out.println("Invalid username or password. Please re-enter");

            System.out.println("Enter your username");
            userName = scan.next();

            System.out.println("Enter your password");
            password = scan.next();

            attempt++;
        }
        System.out.println("Successfully logged in");
    }
}
