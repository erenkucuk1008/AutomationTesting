package day37_CustomClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public char gender;
    public int age;
    public LocalDate DOB;
    public double GPA;

    public void setInfo(String name, String ID, LocalDate DOB, char gender,double GPA){
        this.name = name;
        this.ID = ID;
        this.DOB = DOB;
        age = LocalDate.now().getYear() - DOB.getYear();
        this.gender = gender;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", DOB=" + DOB +
                ", GPA=" + GPA +
                '}';
    }

    public void study(){
        System.out.println("Students should study 2 hours per day after course");
    }
}
