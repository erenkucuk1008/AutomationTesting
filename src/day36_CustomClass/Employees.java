package day36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

public class Employees {

    public String name, ID, jobTitle, companyName;
    public char gender;
    public double salary;
    public LocalDate hireDate;

    public void setInfo(String name, char gender, String ID, String jobTitle,
                        String companyName, double salary, LocalDate hireDate){

        this.name = name; // intance = local **oldugunda this keyword u kullaniriz
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void getInfo(){
        System.out.println("Name: "+name+", Gender : "+gender+", ID : "+ID+
                ", Job Title : "+jobTitle+", Company Name: "+companyName+", Salary: "+salary+
                ", Hired Date: "+hireDate);
    }

    public void attempMeeting(){
        System.out.println("SDET and QA must attend the meetings.");
    }

    public void working(){
        System.out.println("All employees must work 40hours in a week...");
    }

    public static void main(String[] args) {

        String companyName = "Bank Of America";

        Employees[] employees = {
                new Employees(),
                new Employees(),
                new Employees(),
                new Employees(),
                new Employees(),
        };

        employees[0].setInfo("Eren",'M',"12345","SDET","Facebook",
                145500,LocalDate.of(2022,11,28));
        employees[1].setInfo("Arzum",'F',"2231","SDET","Google",
                155000,LocalDate.of(2023,2,25));
        employees[2].setInfo("Hakan",'M',"4578","QA","Tesla",
                85000,LocalDate.of(2022,10,3));
        employees[3].setInfo("Sevgi",'F',"34567","QA","Microsoft",
                95000,LocalDate.of(2023,3,12));
        employees[4].setInfo("Solomon",'M',"704","Developer","Amazon",
                180000,LocalDate.of(2022,11,30));

        for (Employees eachEmp : employees){
            eachEmp.getInfo();
        }

        System.out.println("=========================================");

        System.out.println("Here is rich Employees");
        ArrayList<Employees> richPeople = new ArrayList<>();
        richPeople.addAll(Arrays.asList(employees));
        richPeople.removeIf(p-> p.salary<100000);

        for (Employees each : richPeople){
            System.out.println(each.name+" : "+each.jobTitle+", $"+each.salary);
        }

        System.out.println("=========================================");

        System.out.println("Here is SDET and QA Employees");
        ArrayList<Employees> SDETandQA = new ArrayList<>(Arrays.asList(employees));
        SDETandQA.removeIf(p-> !(p.jobTitle.equalsIgnoreCase("SDET") || p.jobTitle.equalsIgnoreCase("QA")));

        for (Employees each : SDETandQA){
            System.out.println(each.name+" : "+each.jobTitle+", $"+each.salary);
        }

        System.out.println("============================================");

        double maxSalary = employees[0].salary;

        for (Employees eachEmployee : employees){
            maxSalary = Math.max(maxSalary, eachEmployee.salary);// iki sayidan max i bulur.
            //if (eachEmployee.salary > maxSalary){
              //  maxSalary = eachEmployee.salary;
            //}
        }
        System.out.println("maxSalary = " + maxSalary);

    }
}


/*
name, gender, ssn, ID, job title, company name, salary

setInfo
getInfo
attendMeeting
working
 */