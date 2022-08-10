package day54_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicates {

    public static void main(String[] args) {

        String str = "aabcccdee";// a=2, c=3, e=2

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            result.put(each, frequency);
            if (frequency == 1){
                result.remove(each);
            }
        }
        System.out.println(result);
    }
}
