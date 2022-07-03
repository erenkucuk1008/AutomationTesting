package day38_Statics.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        Developer[] developers = {new Developer(), new Developer(), new Developer()};

        developers[0].setInfo("Eren","D001","Developer","Facebook",145000,'M');
        developers[1].setInfo("Arzum","D002","Developer","Google",138000,'F');
        developers[2].setInfo("Muhtar","D003","Developer","Cybertek",200000,'M');

        Developer developer4 = new Developer();
        developer4.setInfo("Ian","D004","Developer","Tesla",120000,'M');

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester1.setInfo("Adnan","T-001","Tester","Microsoft",95000,'M');
        tester2.setInfo("Dean","T-002","Tester","Cybertek",100000,'M');
        tester3.setInfo("Jair","T-003","Tester","Cybertek",80000,'M');

        Tester[] tester = {tester2,tester3};

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.addTester(tester1); // tek tek ekliyor
        scrum1.addTester(tester); // array i direk ekliyor--- methoddan oyle geliyor.
        scrum1.addDeveloper(developer4); // tek tek ekliyor
        scrum1.addDeveloper(developers); // array i direk ekliyor
        scrum1.setInfo("Mahmut","Basar","Omar");


        System.out.println("Scrum1: ");
        System.out.println(scrum1);
        for (Tester each : scrum1.testersTeam){
            System.out.println(each);
        }

        for (Developer each : scrum1.developersTeam){
            System.out.println(each);
        }

        System.out.println("===========================================================================================");

        Tester tester4 = new Tester();
        Tester tester5 = new Tester();
        tester4.setInfo("Hakan","T-004","Tester","Cydeo",102000,'M');
        tester5.setInfo("Sevgi","T-005","Tester","Cydeo",97500,'F');

        Developer developer5 = new Developer();
        Developer developer6 = new Developer();
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
        for (Tester each : scrum2.testersTeam){
            System.out.println(each);
        }

        for (Developer each : scrum2.developersTeam){
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
            for (Tester eachTester : eachTeam.testersTeam){
                System.out.println(eachTester.name+", $"+eachTester.salary); // print names and salaries of every single testers
            }
        }
        System.out.println("=================================================");
        System.out.println("Developers names and their salaries:");
        for (ScrumTeam eachTeam : scrums){
            for (Developer eachDev : eachTeam.developersTeam){
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
            for (Tester eachTester : eachTeam.testersTeam){
                System.out.println(eachTester.name+", $"+eachTester.salary);
            }
            System.out.println("----------------------");
            System.out.println("Developer:");
            for (Developer eachDeveloper : eachTeam.developersTeam){
                System.out.println(eachDeveloper.name+", $"+eachDeveloper.salary);
            }
            System.out.println("----------------------");
        }

    }
}
