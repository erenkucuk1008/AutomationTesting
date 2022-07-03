package day23_Arrays;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator");
        char o = scan.next().charAt(0);
        double sum = (o=='+')? num1+num2: (o=='-')? num1-num2:
                (o=='*')? num1*num2: (o=='/')? num1/num2:0;
        System.out.println("Result is: "+sum);
        scan.nextLine();

        while (true){
            System.out.println("Do you want to continue?");
            String a = scan.nextLine();

            if (a.equalsIgnoreCase("yes")){
                System.out.println("Enter 2 numbers");
                num1 = scan.nextInt();
                num2 = scan.nextInt();
                System.out.println("Enter a math operator");
                o = scan.next().charAt(0);
                sum = (o=='+')? num1+num2: (o=='-')? num1-num2:
                        (o=='*')? num1*num2: (o=='/')? num1/num2:0;
                System.out.println("Result is: "+sum);
                scan.nextLine();
            }else if (a.equalsIgnoreCase("no")){
                break;
            }else {
                System.out.println("Invalid answer..Please enter \"yes\" or \"no\"");
            }
        }
    }
}
