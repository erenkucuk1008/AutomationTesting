package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('X');
        chars.add('A');
        chars.add('Z');
        chars.add('Q');

        System.out.println(chars);

        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(90);
        numbers.add(40);
        numbers.add(55);
        numbers.add(70);
        numbers.add(80);
        numbers.add(70);
        numbers.add(60);

        Collections.sort(numbers);

        System.out.println("Max number is :"+numbers.get(numbers.size()-1));
        System.out.println("Min number is: "+numbers.get(0));

        System.out.println(numbers);

        Collections.swap(numbers,2,3);
        System.out.println(numbers);

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        Collections.swap(numbers,numbers.indexOf(60),numbers.lastIndexOf(70));
        System.out.println(numbers);

        System.out.println("=============================");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('F');
        list.add('C');
        list.add('D');
        list.add('A');
        list.add('B');
        list.add('A');

        System.out.println(list);

        Collections.replaceAll(list,'A','E');
        System.out.println(list);

        int frequencyOfE = Collections.frequency(list,'E');
        System.out.println(frequencyOfE);

        System.out.println("==============================");

        ArrayList<String> names = new ArrayList<>();
        names.add("Eren");
        names.add("Arzum");
        names.add("Eren");
        names.add("Suleyman");
        names.add("Eren");

        System.out.println(names);

        int freq = Collections.frequency(names,"Eren");
        System.out.println("Frequency of Eren "+freq);

        int freqA = Collections.frequency(names,"Suleyman");
        System.out.println("Frequency of Suleyman : "+freqA);

        System.out.println("======================================");

        int[] arr = {12,22,44,32,45,2,3,4};
        ArrayList<Integer> nums = new ArrayList<>();
        for (int each : arr){
            nums.add(each);
        }
        System.out.println("Max is: "+Collections.max(nums));
        System.out.println("Min is: "+Collections.min(nums));

    }
}
