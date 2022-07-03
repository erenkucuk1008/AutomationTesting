package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Hakan");
        names.add("Sevgi");
        names.add("Suleyman");
        names.add("Eren");
        names.add("Arzum");
        names.add("Eren");
        names.add("Suleyman");

        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        names.remove("Eren");
        System.out.println(names);

        names.remove(names.size()-1);
        System.out.println(names);

        names.clear();
        System.out.println(names);

    }
}
