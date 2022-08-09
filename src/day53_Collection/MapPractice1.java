package day53_Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();

        // key must be unique
        //                 KEY  ,   VALUE
        employeeInfo.put("Afrooz", 120000.0);
        employeeInfo.put("Eren", 145000.0);
        employeeInfo.put("Arzum", 154600.0);

        //employeeInfo.remove("Afrooz");

        System.out.println(employeeInfo.size());
        System.out.println(employeeInfo);

        System.out.println("Salary of Eren: "+employeeInfo.get("Eren"));
        System.out.println("Salary of Afrooz: "+employeeInfo.get("Afrooz"));

        System.out.println(employeeInfo.containsKey("Eren"));
        System.out.println(employeeInfo.containsKey("Arzum"));

        //employeeInfo.clear();
        //System.out.println(employeeInfo);

        for (String eachKey : employeeInfo.keySet()) {
            System.out.println(eachKey+" : "+employeeInfo.get(eachKey));
        }

        System.out.println("========================");

        employeeInfo.put("Mustafa",105000.0);
        employeeInfo.put("Emre",103000.0);
        employeeInfo.put("Apo",100000.0);

        double max = 0;
        String nameMax = "";

        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if (eachSalary>max){
                max = eachSalary;
                nameMax = eachName;
            }
        }

    }
}
