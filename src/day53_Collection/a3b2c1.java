package day53_Collection;

import java.util.*;

public class a3b2c1 {

    public static void main(String[] args) {

        String str= "aaabbc";

        Set<String> s = new LinkedHashSet<>(Arrays.asList(str.split("")));

        for (String each : s) {
            System.out.print(each+Collections.frequency(Arrays.asList(str.split("")),each));
        }
    }
}
