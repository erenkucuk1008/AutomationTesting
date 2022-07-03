package day23_Arrays;

import java.util.Scanner;


public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price = 0;

        while (true){

            System.out.println("Which bedroom do you want to stay");
            System.out.println("1.King Room - $120");
            System.out.println("2.Queen Room - $100");
            System.out.println("3.Single Room - $80");
            int room = scan.nextInt();

            if (room==1){
                price += 120;
            }else if (room==2){
                price += 100;
            }else if (room==3){
                price += 80;
            }else {
                System.out.println("Re-enter");
            }

            scan.nextLine();
            System.out.println("Do you want to reserve another room?");
            String yOrN = scan.nextLine();

            while (! (yOrN.equalsIgnoreCase("yes") || yOrN.equalsIgnoreCase("no"))) {
                System.out.println("Invalid answer..");
                System.out.println("Do you want to reserve another room?");
                yOrN = scan.nextLine();
            }

            if (yOrN.equalsIgnoreCase("no")){
                break;
            }
        }

        System.out.println("Your total price is: $"+price);
    }
}
