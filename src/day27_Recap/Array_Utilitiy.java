package day27_Recap;

import java.util.Arrays;

public class Array_Utilitiy {

    public static void main(String[] args) {

        String[] str1 = {"A","B","C"};
        String[] str2 = {"A","B","C"};

        System.out.println(Arrays.equals(str1,str2));// true

        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","C","B"};

        System.out.println(Arrays.equals(s1,s2)); // false

        Arrays.sort(s2);

        System.out.println(Arrays.equals(s1,s2)); // true
    }
}
