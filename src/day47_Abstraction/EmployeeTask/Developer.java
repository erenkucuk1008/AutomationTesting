package day47_Abstraction.EmployeeTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Developer is writing codes");
    }

    @Override
    public void sleep() {
        System.out.println("Developers usually sleep 6 hours");
    }
}
