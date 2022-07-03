package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperation {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        boolean r1 = nums.contains(1);
        boolean r2 = nums.contains(2) && nums.contains(3);
        System.out.println("r1: "+r1);
        System.out.println("r2: "+r2);

        boolean r3 = nums.containsAll(Arrays.asList(2,4,40));
        System.out.println("r3: "+r3);

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Eren");
        group1.add("Arzum");
        group1.add("Nadir");
        group1.add("Muhtar");
        group1.add("Asiya");

        boolean r4 = group1.containsAll(Arrays.asList("Eren","Arzum"));
        System.out.println("r4: "+r4);

        System.out.println("=================================");
        //AddAll

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','C'));
        System.out.println(chars);

        System.out.println("=================================");

        String[] names = {"Eren","Muhtar","Nadir","Arzum","Asiya"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        //nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);

        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A','B','C'));
        ch1.addAll(Arrays.asList('D','E','F','G'));
        System.out.println(ch1);

        System.out.println("==================================");
        //removeAll

        nameList.removeAll(Arrays.asList("Muhtar","Asiya","Nadir"));
        System.out.println(nameList);

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed","Eren","Ahmed","Asiya","Arzum","Ahmed"));
        System.out.println(employees);

        employees.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employees);

        System.out.println("===================================");
        //retainAll

        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmed","Eren","Ahmed","Asiya","Arzum","Ahmed"));

        employees2.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employees2);
    }
}
