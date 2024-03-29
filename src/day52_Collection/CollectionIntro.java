package day52_Collection;

import java.awt.*;
import java.util.*;
import java.util.List;

public class CollectionIntro {

    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());//0

        numbers.add(100);
        System.out.println(numbers.size());

        numbers.addAll(Arrays.asList(200,300,400,500));
        System.out.println(numbers.size());

        numbers.removeAll(Arrays.asList(100,400));
        System.out.println(numbers.size());
        System.out.println(numbers);

        System.out.println(  ((ArrayList)numbers).get(0) );

        Collection<String> names = new LinkedHashSet<>();
        Collection<Integer> scores = new LinkedList<>();

    }
}
