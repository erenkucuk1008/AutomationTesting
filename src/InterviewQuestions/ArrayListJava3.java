package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava3 {

    public static void main(String[] args) {

        String[] names = {"Java","Java","Java"};
        ArrayList<String> list = new ArrayList<>();
        for (String each : names){
            list.add(each);
        }

        int freq = Collections.frequency(list,"Java");
        System.out.println(freq);
    }
}
