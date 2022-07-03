package day39_StaticBlock;

import day37_CustomClass.Employee;

public class StaticBlock {

    public static String company;
    public static Employee employee1;
    public static boolean isEmployed;
    public static int a;

    public int b;

    static {
        company = "Bank of Hawaii";
        isEmployed = true;
        employee1 = new Employee();
        employee1.setInfo("Eren","Facebook","Tester",40,65,8,22);

        a = 200;

        System.out.println("day39_StaticBlock");
    }
/*
    public static void main(String[] args) {

        company = "Bank of Hawaii";
        isEmployed = true;
        employee1 = new Employee();
        employee1.setInfo("Eren","Facebook","Tester",40,65,8,22);

        a = 200;

        System.out.println("StaticBlock");

        System.out.println(company);
        System.out.println(employee1);
    }

 */
}
