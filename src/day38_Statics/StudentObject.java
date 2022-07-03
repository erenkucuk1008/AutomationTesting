package day38_Statics;

public class StudentObject {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        CybertekStudent student2 = new CybertekStudent();

        //System.out.println(student1.schoolName);
        //System.out.println(student2.schoolName);

        System.out.println(CybertekStudent.schoolName); // preferred

        student1.setInfo("Eren",33,001,'M');
        student2.setInfo("Arzum",27,002,'F');
        System.out.println(student1);
        System.out.println(student2);

        //student1.getSchoolInfo();
        //student2.getSchoolInfo();

        CybertekStudent.getSchoolInfo();
    }
}
