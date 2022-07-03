package day16_Scanner;

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        System.out.println("Are you currently working ? True/False");
        boolean workingStatus = scan.nextBoolean();

        double salary = 0;

        if (workingStatus){
            System.out.println("What is your salary?");
            salary = scan.nextDouble();
        }
        System.out.println("Full name is :" +firstName+" "+lastName);
        System.out.println("Employed "+workingStatus);
        System.out.println("Salary: "+ salary);



    }
}
