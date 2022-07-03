package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(85); // autoboxing    0
        scores.add(67); // autoboxing    1
        scores.add(100); // autoboxing   2

        scores.add(1,22);
        System.out.println(scores);

        System.out.println("===========================");

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");

        groceryList.add(0,"Coke");
        groceryList.add(1,"Watermelon");

        System.out.println(groceryList);

        String item1 = groceryList.get(2);
        System.out.println("item1 = " + item1);

        int total = groceryList.size();
        System.out.println("total = " + total);

        System.out.println(groceryList.get(groceryList.size()-1)); // get (last index)
    }
}
