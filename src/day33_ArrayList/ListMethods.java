package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(100);
        list.add(200);
        list.add(300);

        list.set(1,400);

        System.out.println(list);

        System.out.println("============================");

        // remove (INDEX)
        ArrayList<Character> list1 = new ArrayList<>();

        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');

        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);

        System.out.println("==========================");

        // remove (OBJECT)
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');
        System.out.println(list2);

        Character ch = 'D';
        list2.remove(ch); // remove (object)

        list2.remove(Character.valueOf('C')); // remove (object)
        System.out.println(list2);
    }
}
