package day41_Encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private final char gender; //final means constant
    private final LocalDate DOB; // final means constant

    public Person(String name, int age, char gender, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }
}
