package day42_Inheritance.PersonTask;

public class Employee extends Person{ // Employee IS A Person

    public int hourlyRate;
    public String jobTitle, ID;

    public void setInfo(String name, int age, char gender, int hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.jobTitle = jobTitle;
        this.ID = ID;
    }

    public void work(){
        System.out.println(name+","+ID+" ID number is working");
    }

    public double calcSalary(){
        return hourlyRate * 40 * 52;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", hourlyRate=" + hourlyRate +
                ", jobTitle='" + jobTitle +
                ", ID='" + ID +
                ", salary= $" + (int)calcSalary() +
                '}';
    }

    public static String publicVariable = "Public";
    protected static String protectedVariable = "Protected";
    static String defaultVariable = "default";
}
