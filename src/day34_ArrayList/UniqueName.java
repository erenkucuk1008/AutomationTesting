package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class UniqueName {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Eren","Arzum","Nadir","Nadir","Muhtar","Asiya","Muhtar","Asiya"));
/*
        for (String each: names){
            if (Collections.frequency(names,each)==1){
                System.out.println(each);
            }
        }
 */
        names.removeIf(p-> Collections.frequency(names,p)>1);
        System.out.println(names);
    }
}
