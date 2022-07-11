package day42_Inheritance.PersonTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void code(){
        System.out.println(name+","+ID+" ID number is coding.");
    }
}
