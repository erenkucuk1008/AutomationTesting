package day37_CustomClass;

public class CybertekSchool {

    public String name, ID;
    public int age;
    public double gpa;
    public char gender;

    public void setInfo(String name, char gender, String ID, int age, double gpa){
        this.name=name;
        this.gender=gender;
        this.ID=ID;
        this.age=age;
        this.gpa=gpa;
    }

    @Override
    public String toString() {
        return "CybertekSchool{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", gender=" + gender +
                '}';
    }
}
