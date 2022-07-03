package day09_IfStatement;

public class WarmUpTask {

    public static void main(String[] args) {

        String name = "James";
        int age = 19;
        boolean isEligible = age>=21;
        System.out.println(name+" is eligible to buy alcohol :\n\t"+isEligible);

        String name1= "John";
        String citizinShip = "USA";
        boolean isEligibleVote = citizinShip == "USA";
        System.out.println(name1+" is eligible to vote Donald Trump or Joe Biden :\n\t"+isEligibleVote);
    }
}
