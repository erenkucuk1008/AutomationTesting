package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setInfo("Eren","A101", LocalDate.of(1989,6,1),'M',3.20);
        System.out.println(s1);

        System.out.println("============================================");

        Student s2 = new Student();
        s2.setInfo("Arzum","B101",LocalDate.of(1995,05,06),'F',3.60);

        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(s1,s2));
        System.out.println(studentList);

        System.out.println("=============================================");

        Student[] students = {s1,s2};
        System.out.println(Arrays.toString(students));
    }
}
