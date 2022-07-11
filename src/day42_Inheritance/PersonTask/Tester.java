package day42_Inheritance.PersonTask;

public class Tester extends Employee{ // Tester IS a Person, Tester IS an Employee

    public Tester(String name, int age, char gender, int hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void testing(){
        System.out.println(name+","+ID+" ID number is testing");
    }
}
