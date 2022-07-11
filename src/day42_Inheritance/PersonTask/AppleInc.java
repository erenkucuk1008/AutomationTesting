package day42_Inheritance.PersonTask;

public class AppleInc { //AppleInc HAS a tester, HAS a developer

    public static void main(String[] args) {

        Tester t1 = new Tester("Eren",33,'M',67,"SDET","T015");
        System.out.println(t1);
        t1.testing();
        t1.eat();
        t1.sleep();
        t1.work();
        System.out.println("Salary : $"+t1.calcSalary());

        System.out.println("===========================================");

        Developer d1 = new Developer("Suleyman",36,'M',80,"Developer","D001");
        System.out.println(d1);
        d1.code();
        d1.work();

        System.out.println("===========================================");

    }
}
