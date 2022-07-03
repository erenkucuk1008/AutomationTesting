package day38_Statics;

import day38_Statics.ScrumTeam.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

class Tester {

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

class Developer {

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

public class ScrumTeam1 {

    public String PO, BA, SM;
    public ArrayList<day38_Statics.ScrumTeam.Tester> testersTeam = new ArrayList<>();
    public ArrayList<day38_Statics.ScrumTeam.Developer> developersTeam = new ArrayList<>();

    public static boolean hasSprint = true;
    public static boolean hasMeeting = true;

    public void setInfo(String PO, String BA, String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(day38_Statics.ScrumTeam.Tester tester){
        testersTeam.add(tester);
    }

    public void addTester(day38_Statics.ScrumTeam.Tester[] testers){
        testersTeam.addAll(Arrays.asList(testers));
    }

    public void removeTester(String ID){
        testersTeam.removeIf(p-> p.ID.equalsIgnoreCase(ID));
    }

    public void addDeveloper(day38_Statics.ScrumTeam.Developer developer){
        developersTeam.add(developer);
    }

    public void addDeveloper(day38_Statics.ScrumTeam.Developer[] developers){
        developersTeam.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(String ID){
        developersTeam.removeIf(p-> p.ID.equalsIgnoreCase(ID));
    }

    public String toString(){
        return "PO: "+PO+", BA: "+BA+", SM: "+SM+", Total numbers of Testers: "+testersTeam.size()
                +", Total numbers of Developers: "+ developersTeam.size();
    }
}

class MyScrumTeam {

    public static void main(String[] args) {

        day38_Statics.ScrumTeam.Developer[] developers = {new day38_Statics.ScrumTeam.Developer(), new day38_Statics.ScrumTeam.Developer(), new day38_Statics.ScrumTeam.Developer()};

        developers[0].setInfo("Eren","D001","Developer","Facebook",145000,'M');
        developers[1].setInfo("Arzum","D002","Developer","Google",138000,'F');
        developers[2].setInfo("Muhtar","D003","Developer","Cybertek",200000,'M');

        day38_Statics.ScrumTeam.Developer developer4 = new day38_Statics.ScrumTeam.Developer();
        developer4.setInfo("Ian","D004","Developer","Tesla",120000,'M');

        day38_Statics.ScrumTeam.Tester tester1 = new day38_Statics.ScrumTeam.Tester();
        day38_Statics.ScrumTeam.Tester tester2 = new day38_Statics.ScrumTeam.Tester();
        day38_Statics.ScrumTeam.Tester tester3 = new day38_Statics.ScrumTeam.Tester();
        tester1.setInfo("Adnan","T-001","Tester","Microsoft",95000,'M');
        tester2.setInfo("Dean","T-002","Tester","Cybertek",100000,'M');
        tester3.setInfo("Jair","T-003","Tester","Cybertek",80000,'M');

        day38_Statics.ScrumTeam.Tester[] tester = {tester2,tester3};

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.addTester(tester1); // tek tek ekliyor
        scrum1.addTester(tester); // array i direk ekliyor--- methoddan oyle geliyor.
        scrum1.addDeveloper(developer4); // tek tek ekliyor
        scrum1.addDeveloper(developers); // array i direk ekliyor
        scrum1.setInfo("Mahmut","Basar","Omar");


        System.out.println("Scrum1: ");
        System.out.println(scrum1);
        for (day38_Statics.ScrumTeam.Tester each : scrum1.testersTeam){
            System.out.println(each);
        }

        for (day38_Statics.ScrumTeam.Developer each : scrum1.developersTeam){
            System.out.println(each);
        }

        System.out.println("===========================================================================================");

        day38_Statics.ScrumTeam.Tester tester4 = new day38_Statics.ScrumTeam.Tester();
        day38_Statics.ScrumTeam.Tester tester5 = new day38_Statics.ScrumTeam.Tester();
        tester4.setInfo("Hakan","T-004","Tester","Cydeo",102000,'M');
        tester5.setInfo("Sevgi","T-005","Tester","Cydeo",97500,'F');

        day38_Statics.ScrumTeam.Developer developer5 = new day38_Statics.ScrumTeam.Developer();
        day38_Statics.ScrumTeam.Developer developer6 = new day38_Statics.ScrumTeam.Developer();
        developer5.setInfo("Jacky","D005","Developer","Apple",140000,'M');
        developer6.setInfo("John","D006","Developer","Tesla",164000,'M');

        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.addTester(tester4);
        scrum2.addTester(tester5);
        scrum2.addDeveloper(developer5);
        scrum2.addDeveloper(developer6);

        scrum2.setInfo("Ahmet","Ugur","Kucuk");

        System.out.println("Scrum2: ");
        System.out.println(scrum2);
        for (day38_Statics.ScrumTeam.Tester each : scrum2.testersTeam){
            System.out.println(each);
        }

        for (day38_Statics.ScrumTeam.Developer each : scrum2.developersTeam){
            System.out.println(each);
        }

        //scrum1.removeTester("T-001");
        //scrum1.removeDeveloper("D003");
        System.out.println("=======================================================");

        System.out.println("SCRUM1: "+"\n"+scrum1+"\n");
        System.out.println("SCRUM2: "+"\n"+scrum2+"\n");

        System.out.println("========================================================");

        ScrumTeam[] scrums = {scrum1, scrum2};

        System.out.println("Testers names and their salaries:");
        for (ScrumTeam eachTeam : scrums ){
            for (day38_Statics.ScrumTeam.Tester eachTester : eachTeam.testersTeam){
                System.out.println(eachTester.name+", $"+eachTester.salary); // print names and salaries of every single testers
            }
        }
        System.out.println("=================================================");
        System.out.println("Developers names and their salaries:");
        for (ScrumTeam eachTeam : scrums){
            for (day38_Statics.ScrumTeam.Developer eachDev : eachTeam.developersTeam){
                System.out.println(eachDev.name +", $" +eachDev.salary); // print names and salary of every single developers
            }
        }

        System.out.println("=======================================================");

        int countTesters = 0;
        int countDevelopers = 0;

        for (ScrumTeam each : scrums){
            countTesters += each.testersTeam.size();
            countDevelopers += each.developersTeam.size();
        }

        System.out.println("Testers: "+countTesters);
        System.out.println("Developers: "+countDevelopers);

        System.out.println("=======================================================================");

        // ARRAY LIST ILE YAPALIM

        ArrayList<ScrumTeam> scrumList = new ArrayList<>();
        scrumList.addAll(Arrays.asList(scrums));

        for (ScrumTeam eachTeam : scrumList){
            System.out.println("Tester:");
            for (day38_Statics.ScrumTeam.Tester eachTester : eachTeam.testersTeam){
                System.out.println(eachTester.name+", $"+eachTester.salary);
            }
            System.out.println("----------------------");
            System.out.println("Developer:");
            for (day38_Statics.ScrumTeam.Developer eachDeveloper : eachTeam.developersTeam){
                System.out.println(eachDeveloper.name+", $"+eachDeveloper.salary);
            }
            System.out.println("----------------------");
        }
    }
}
