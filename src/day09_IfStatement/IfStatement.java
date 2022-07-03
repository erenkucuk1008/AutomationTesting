package day09_IfStatement;

public class IfStatement {

    public static void main(String[] args) {


        int year = 2020;
        boolean isPandemic = year == 2020;

        if (isPandemic){
            System.out.println("Stay at home");
            System.out.println("Social distancing");
            System.out.println("wash your hands");
        }

        if (!isPandemic){
            System.out.println("You are free to go out.");
        }


        String name = "Eren";
        int age = 32;
        String citizen = "Turkey";
        boolean eligibleToVote = age>=18 && citizen == "USA";

        if (eligibleToVote){
            System.out.println(name+" is eligible to vote");
        }

        if (!eligibleToVote){
            System.out.println(name+" is not eligible to vote");
        }



    }


}
