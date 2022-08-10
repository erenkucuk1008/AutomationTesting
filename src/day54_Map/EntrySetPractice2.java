package day54_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetPractice2 {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> employeeInfo = new LinkedHashMap<>();

        employeeInfo.put("Eren", 145000);
        employeeInfo.put("Arzum", 154650);
        employeeInfo.put("Suleyman",120000);
        employeeInfo.put("Solomon", 134500);
        employeeInfo.put("Muhtar", 104000);

        Integer max = Integer.MIN_VALUE;
        String nameMax = "";

        Integer min = Integer.MAX_VALUE;
        String nameMin = "";

        for (Map.Entry<String, Integer> each : employeeInfo.entrySet()) {
            String name = each.getKey();
            Integer salary = each.getValue();

            if (salary > max){
                max = salary;
                nameMax = name;
            }

            if (salary < min){
                min = salary;
                nameMin = name;
            }

        }

        System.out.println("nameMax = " + nameMax);
        System.out.println("max = " + max);

        System.out.println("nameMin = " + nameMin);
        System.out.println("min = " + min);
    }
}
