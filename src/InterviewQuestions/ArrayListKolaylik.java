package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListKolaylik {

    public static void main(String[] args) {

        String[] names = {"Eren","Arzum","Muhtar","Nadir","Asiya","Asiya","Muhtar","Nadir"};
        ArrayList<String> listName = new ArrayList<>(Arrays.asList(names));
        String result = "";

        for (String each : listName){
            int freq = Collections.frequency(listName,each);
            if (!result.contains(each)){
                result+= each+freq;
            }

        }
        System.out.println(result);

        System.out.println("===================================================");

        String names1 = "Eren Arzum Muhtar Nadir Asiya Asiya Muhtar Nadir";
        ArrayList<String> listName1 = new ArrayList<>(Arrays.asList(names1.split(" ")));
        String result1 = "";

        for (String each : listName){
            int freq = Collections.frequency(listName,each);
            if (!result.contains(each)){
                result+= each+freq;
            }

        }
        System.out.println(result);
    }
}
