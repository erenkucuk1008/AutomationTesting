package day30_ReturnMethods;

import library.StringUtility;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbcc";
        String result = "";

        String nonDup = StringUtility.removeDuplicates(str); // a b c

        for (int i=0; i<=nonDup.length()-1; i++){
            char ch = nonDup.charAt(i);
            int count = StringUtility.frequency(str,ch);
            result += ""+ch+count;
        }
        System.out.println(result);

        System.out.println("===================================");

        String str2 = "aaaaaaaaaaaaabbbbbbbbbbbbbbbsssss";
        String freqOfCh = frequencyOfCharacters(str2);
        System.out.println(freqOfCh);
    }

    public static String frequencyOfCharacters(String str){

        String result = "";
        String nonDup = StringUtility.removeDuplicates(str); // a b c

        for (int i=0; i<=nonDup.length()-1; i++){
            char ch = nonDup.charAt(i);
            int count = StringUtility.frequency(str,ch);
            result += ""+ch+count;
        }
        return result;
    }
}
