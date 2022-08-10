package day54_Map;

import java.util.LinkedHashMap;

public class EntrySetPractice {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("A", 85);
        students.put("B", 75);
        students.put("C", 95);
        students.put("D", 87);
        students.put("E", 88);

        System.out.println(students);

        System.out.println("========================");

        for (String eachKey : students.keySet()) {
            System.out.println(eachKey+" : "+students.get(eachKey));
        }

        System.out.println("=============================");

        for (Integer eachValue : students.values()) {
            System.out.println(eachValue);
        }

        System.out.println("=============================");



    }
}
