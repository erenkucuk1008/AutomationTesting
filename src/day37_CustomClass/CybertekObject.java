package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekObject {

    public static void main(String[] args) {

        CybertekSchool[] students = {
                new CybertekSchool(),
                new CybertekSchool(),
                new CybertekSchool(),
                new CybertekSchool(),
                new CybertekSchool(),
                new CybertekSchool(),
                new CybertekSchool(),
                new CybertekSchool(),
                new CybertekSchool(),
                new CybertekSchool(),
        };

        students[0].setInfo("Eren",'M',"A111",33,3.5);
        students[1].setInfo("Arzum",'F',"A123",27,3.8);
        students[2].setInfo("Muhtar",'M',"A432",44,3.1);
        students[3].setInfo("Asiya",'F',"B321",33,2.9);
        students[4].setInfo("Nadir",'M',"A329",39,2.8);
        students[5].setInfo("Daniel",'M',"Q293",21,2.0);
        students[6].setInfo("Mary",'F',"D321",22,3.3);
        students[7].setInfo("Sevgi",'F',"S213",25,2.7);
        students[8].setInfo("Hakan",'M',"H234",40,2.9);
        students[9].setInfo("Suleyman",'M',"S123",37,3.4);

        ArrayList<CybertekSchool> studentList = new ArrayList<>(Arrays.asList(students));

        ArrayList<CybertekSchool> higherThan3 = new ArrayList<>();
        higherThan3.addAll(Arrays.asList(students));
        higherThan3.removeIf(p-> p.gpa<3);
        System.out.println(higherThan3);

        System.out.println("===========================================");

        ArrayList<CybertekSchool> between2and3 = new ArrayList<>();
        between2and3.addAll(Arrays.asList(students));
        between2and3.removeIf(p-> p.gpa<2);
        between2and3.removeIf(p-> p.gpa>3);
        System.out.println(between2and3);

        System.out.println("===========================================");

        ArrayList<CybertekSchool> female = new ArrayList<>(Arrays.asList(students));
        female.removeIf(p-> p.gender=='M');
        System.out.println(female);

        System.out.println("============================================");

        ArrayList<CybertekSchool> male = new ArrayList<>(Arrays.asList(students));
        male.removeIf(p-> p.gender=='F');
        System.out.println(male);

        System.out.println("============================================");

        // yas olarak en kucuk kim. kac yasinda ve butun infolari ni print ediyoruz
        int youngest = students[0].age; // arrayden aliyoruz datayi
        CybertekSchool youngestStudent =null;

        for (CybertekSchool each : students){
            if (each.age<youngest){
                youngest=each.age;
                youngestStudent = each;
            }
        }
        System.out.println(youngest);
        System.out.println(youngestStudent);

        System.out.println("==================================================");
        //en buyuk kim
        int oldest = studentList.get(0).age; // arrayListden aliyoruz datayi. Ikiside ayni sey
        CybertekSchool oldestStudent = null;

        for (CybertekSchool each : studentList){
            if (each.age>oldest){
                oldest=each.age;
                oldestStudent = each;
            }
        }
        System.out.println(oldest);
        System.out.println(oldestStudent);

        System.out.println("==================================================");
        //highest gpa

        double highestGpa = studentList.get(0).gpa;
        CybertekSchool highestGpaStudent = null;

        for (CybertekSchool each : studentList){
            if (each.gpa>highestGpa){
                highestGpa = each.gpa;
                highestGpaStudent = each;
            }
        }

        System.out.println(highestGpa);
        System.out.println(highestGpaStudent);

    }
}
