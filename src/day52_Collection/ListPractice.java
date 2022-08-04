package day52_Collection;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        //List : has index numbers, accepts duplicated objects

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1.removeIf(p-> p<5);
        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));// add method faster
        list2.removeIf(p-> p<5);// faster
        System.out.println(list2);

        List<Integer> list3 = new Vector<>();

        List<Integer> list4 = new Stack<>();



     }
}
