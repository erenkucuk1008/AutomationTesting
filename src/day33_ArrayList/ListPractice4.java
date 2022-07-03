package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(10);
        list.add(50);

        int n1 = list.indexOf(10);
        int n2 = list.lastIndexOf(10);
        System.out.println(n1);
        System.out.println(n2);

        System.out.println( list.contains(60) );
        System.out.println( ! list.contains(60) );

        System.out.println("===========================");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('B');
        characters.add('C');
        System.out.println(characters);

        ArrayList<Character> nonDup = new ArrayList<>();
        for (char each : characters){
            if (!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);

        System.out.println("=====================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        System.out.println(list1 == list2);      // false
        System.out.println(list1.equals(list2)); // true

    }
}
