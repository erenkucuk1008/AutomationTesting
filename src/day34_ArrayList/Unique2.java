package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique2 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,3,44,44,5,66,66,7,7,7,8,9,9));
        nums.removeIf(p-> Collections.frequency(nums,p)==1);
        System.out.println(nums);

        System.out.println("==========================");


        String str = "aabccdeaaedf";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(p-> Collections.frequency(list,p)>1);
        System.out.println(list);

        // if we want to see the result as String
        String result = list.toString().replace(", ","").substring(1,3);
        System.out.println(result);

        System.out.println("==================================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','9','c','#','1','&'));
        //chars.removeIf(p-> Character.isDigit(p) || Character.isLetter(p));
        chars.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println(chars);
    }
}
