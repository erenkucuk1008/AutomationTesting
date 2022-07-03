package day23_Arrays;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Enter number1");
        int num1 = scan.nextInt();

        System.out.println("Enter number2");
        int num2 = scan.nextInt();

        int sum = num1+num2;

        System.out.println("Sum is: "+sum);

        scan.nextLine();

         */

        while (true){

            System.out.println("Enter number1");
            int num1 = scan.nextInt();
            System.out.println("Enter number2");
            int num2 = scan.nextInt();
            int sum = num1+num2;
            System.out.println("Sum is: "+sum);
            scan.nextLine();
            System.out.println("Do you want to continue");
            String yOrN = scan.nextLine();

            /*if (yOrN.equalsIgnoreCase("yes")){

                System.out.println("Enter number1");
                num1 = scan.nextInt();

                System.out.println("Enter number2");
                num2 = scan.nextInt();

                sum = num1+num2;

                System.out.println("Sum is: "+sum);

             */

            while (! (yOrN.equalsIgnoreCase("yes")||yOrN.equalsIgnoreCase("no"))) {
                System.out.println("Invalid answer..");
                System.out.println("Do you want to continue");
                yOrN = scan.nextLine();
            }

            if (yOrN.equalsIgnoreCase("no")){

                //System.out.println("Sum is: "+sum);
                //System.exit(0);
                break;
            }
        }
    }
}
