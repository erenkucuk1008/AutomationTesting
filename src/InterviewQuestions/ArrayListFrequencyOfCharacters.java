package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDDDDEEE";
        String result = "";
        ArrayList<String> list = new ArrayList<>();

        for (String each : str.split("")){
            list.add(each);
        }
        for (String each : list){
            int freq = Collections.frequency(list,each);
            if (!result.contains(each)){
                result += each+freq;
            }
        }
        System.out.println(result);
    }
}
