package day30_ReturnMethods;

import library.StringUtility;
import library.ArraysUtility;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

        String str = "levelly";
        String reverseName = StringUtility.reverse(str);
        System.out.println(reverseName);

        String str2 = "aaaabbbbbccccdddeeeff";
        String nonDup = StringUtility.removeDuplicates(str2);
        System.out.println(nonDup);

        String str3 = "aabccdeef";
        String uniqueCh = StringUtility.unique(str3);
        System.out.println(uniqueCh);

        System.out.println("=====================================");

        int[] arr1 = {-2,44,2,15,-56,98,52,6};
        int[] descending = ArraysUtility.sort(arr1);
        System.out.println(Arrays.toString(descending));
        System.out.println(ArraysUtility.printArray(descending));

        System.out.println("=====================================");

        String s1 = "cccccccccccccbbbbbbbbbbbbbbbaaa";
        String s2 = "bbbbbbbbbbbbbbaaaaaaaaaaaac";

        boolean r1 = StringUtility.isAnagram(s1,s2);
        System.out.println(r1);
    }
}
