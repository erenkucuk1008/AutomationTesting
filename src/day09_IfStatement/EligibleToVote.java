package day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "John";
        int age = 24;
        String citizen = "USA";
        boolean hasCriminalRecord = false;

        boolean isEligible = citizen == "USA" && age>=18 && hasCriminalRecord == false;

        System.out.println(name+" is eligible to vote : "+isEligible);

        System.out.println("=======================================================");

        String name1 ="Eren";
        String  c1 = "Turkey";
        String  c2 = "USA";

        boolean isEligibleToVote = c1 == "USA" || c2 == "USA";

        System.out.println(name1+" is eligible to vote :"+isEligibleToVote);

    }
}
