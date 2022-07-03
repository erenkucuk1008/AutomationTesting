package day29_CustomMethods;

public class MethodWithParameter {

    public static void main(String[] args) {

        printHello(5);
        age(1989,2022);
        location("Bursa");
        // MethodWithParameter.eligibleToBuyAlcohol(18);  class ismiyle de yazabiliriz
        eligibleToBuyAlcohol(18);
        int age = 23;
        eligibleToBuyAlcohol(age);
    }

    public static void printHello(int numberOfTimes){

        for (int i=0; i<numberOfTimes; i++){
            System.out.println("Hello World");
        }
    }

    public static void age(int birthYear,int currentYear){

        int age = currentYear - birthYear;
        System.out.println("Your age is: "+age);
    }

    public static void location(String hometown){

        System.out.println("Your hometown is: "+ hometown);
    }

    public static void eligibleToBuyAlcohol(int age){

        if (age>21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("Go buy milk");
        }
    }
}
