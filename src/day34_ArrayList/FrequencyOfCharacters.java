package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDDDDEEE";
        String result = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
/*
        for (String each : str.split("")){
            list.add(each);
        }

 */
        for (String each : list){
            int freq = Collections.frequency(list,each);
            if (!result.contains(each)){
                result += each+freq;
            }
        }
        System.out.println(result);
    }
}
