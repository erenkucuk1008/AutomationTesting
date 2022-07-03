package day38_Statics.ScrumTeam;

public class Developer {

    public  String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean hasCodingSkill = true;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding(){
        System.out.println(name+" is coding well");
    }

    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", hasCoding Skill=" + hasCodingSkill +
                '}';
    }
}
