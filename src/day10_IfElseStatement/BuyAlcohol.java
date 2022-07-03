package day10_IfElseStatement;

public class BuyAlcohol {

    public static void main(String[] args) {

        int age = 22;

        if (age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }

        int year = 2021;
        if (year%4==0){
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }

        System.out.println("==============================");

        boolean isAlive = true;
        if (isAlive){
            System.out.println("Keep Coding");
        }else{
            System.out.println("RIP");
        }
    }
}
