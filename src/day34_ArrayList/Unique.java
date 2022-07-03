package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique {

    public static void main(String[] args) {

        String str = "aaabccddefffffghhhhhi";

        ArrayList<Character> chars = new ArrayList<>();

        for (char each : str.toCharArray()){
            chars.add(each);
        }
        for (Character each: chars){
            if (Collections.frequency(chars,each)==1){
                System.out.print(each+" ");
            }
        }
    }
}
