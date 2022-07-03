package day16_Scanner;

import java.util.Scanner;

public class PersonalInfo2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int numberPeople = scan.nextInt();

        int point = 0;

        if (numberPeople<=2){
            point += 1;
        }else if (numberPeople >=3 && numberPeople <=6){
            point += 2;
        }else {
            point += 3;
        }
        scan.nextLine();

        System.out.println("What city do you live in?");
        String city = scan.nextLine();

        System.out.println("You live in downtown ? \"Yes\" or \"No\"");
        String downtown = scan.nextLine();

        String moving = "No";

        if (downtown.equals("Yes")){
            System.out.println("Have you thought about moving to the suburbs? \"Yes\" or \"No\"");
            moving = scan.nextLine();
            if (moving.equals("Yes")){
                point += 1;
            }else {
                point -= 1;
            }
        }

        System.out.println("What is your favorite animal?");
        String animal = scan.nextLine();

        System.out.println("How many pets do you want?");
        int countAnimal = scan.nextInt();

        System.out.println("What is your SSN?");
        long ssn = scan.nextLong();

        System.out.println("You live with "+numberPeople);
        System.out.println("Your city is : "+city);
        System.out.println("You live in downtown : "+downtown);
        System.out.println("You think to move to the suburbs : "+moving);
        System.out.println("Your point is : "+point);

    }
}
