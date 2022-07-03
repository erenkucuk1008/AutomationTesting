package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Ornek_Integer_Characters_ArrayList {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));

        Character[] arr1 = {'a','b'};
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList(arr1));
    }
}
