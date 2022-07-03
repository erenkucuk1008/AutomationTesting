package day23_Arrays;

import java.util.Scanner;

public class Task1_Al {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter 2 numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println("Enter a math operator");
            char o = scan.next().charAt(0);
            double result = (o=='+')? num1+num2: (o=='-')? num1-num2:
                    (o=='*')? num1*num2: (o=='/')? num1/num2:0;
            System.out.println("Result is: "+result);
            System.out.println("Do you want to continue?");
            String a  = scan.next(); // yes

            while ( ! (a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){
                System.out.println("Invalid ansver.. Please enter \"yes\" or \"no\"");
                System.out.println("Do you want to continue?");
                a = scan.next();
            }

            if (a.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}
