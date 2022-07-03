package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class SimpleLambdaExpressions {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,14));

        //removeIf
        Predicate<Integer> lessThan5 = each -> each<5;
        numbers.removeIf(lessThan5);
        System.out.println(numbers);

        System.out.println("====================================");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,14));

        numbers2.removeIf(p-> p%3==0 || p%5==0);
        System.out.println(numbers2);

        System.out.println("====================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","Arzum","Eren","Adnan","Ahmed"));
        names.removeIf(p-> p.startsWith("A") && !p.equals("Arzum") );
        System.out.println(names);

        System.out.println("=====================================");

        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmed","Arzum","Eren","Adnan","Ahmed","Afaroz","GS"));
        employees2.removeIf(p-> p.toLowerCase().contains("a") || p.toLowerCase().contains("r") );
        System.out.println(employees2);
    }
}
