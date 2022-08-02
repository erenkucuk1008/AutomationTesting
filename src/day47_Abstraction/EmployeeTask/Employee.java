package day47_Abstraction.EmployeeTask;

public abstract class Employee extends Person {

    public String ID, jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
