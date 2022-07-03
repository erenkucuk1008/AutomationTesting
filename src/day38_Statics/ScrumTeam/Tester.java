package day38_Statics.ScrumTeam;

public class Tester {

    public  String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean isHuman = true, isCybertekStudent = true;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender){
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name+" is making smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+ " is creating ticket");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", isHuman=" + isHuman +
                ", isCybertekStudent=" + isCybertekStudent +
                '}';
    }
}
