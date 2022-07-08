package day41_Encapsulation;

import java.time.LocalDate;

public class PersonObject {

    public static void main(String[] args) {

        Person p1 = new Person("Eren",33,'M', LocalDate.of(1989,6,1));
        //System.out.println(p1.getName());

        p1.setName("Arzum");
        p1.setAge(27);
        //p1.setGender('F'); final variable oldugu icin set yapamayiz..

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());
        System.out.println(p1.getDOB());
    }
}
