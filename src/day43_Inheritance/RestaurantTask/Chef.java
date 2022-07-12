package day43_Inheritance.RestaurantTask;

import day42_Inheritance.PersonTask.Employee;

public class Chef extends Employee{// Chef is employee, is a person

     /*
inherited:
    variables: name, age, gender, hourlyRate, jobTitle, ID
    methods: work, setInfo, setInfo, toString, eat, sleep, calcSalary()
     */

    public Chef(String name, int age, char gender, int hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void makeOrder(){
        System.out.println(jobTitle+" "+name+" is making order");
    }

    public void cooking(){
        System.out.println(jobTitle+" "+name+" is cooking");
    }
}
