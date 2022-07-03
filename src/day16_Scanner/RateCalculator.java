package day16_Scanner;

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        System.out.println("How many hours you work in a week?");
        int hours = scan.nextInt();

        double hourlyRate = salary / (hours*52);

        System.out.println("Your hourly rate is: "+hourlyRate);
    }
}
