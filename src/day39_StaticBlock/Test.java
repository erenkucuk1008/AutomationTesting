package day39_StaticBlock;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticBlock.company);
        System.out.println(StaticBlock.employee1);
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.isEmployed);

        StaticBlock.company = "Capital One";
        System.out.println(StaticBlock.company);
    }
}
