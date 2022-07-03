package library;

import java.util.Arrays;

public class StringUtility {

    public static int frequency(String str,char ch){

        int count = 0;
        for (char each: str.toCharArray()){
            if (each==ch){
                count++;
            }
        }
        return count;
    }

    public static String unique(String str){

        String unique = "";

        for (int i=0; i<=str.length()-1; i++){
            char each = str.charAt(i);        //each character of the string
            int count = frequency(str,each);  //finding the frequency of every single char from str
            if (count==1){
                unique+=each;
            }
        }
        return unique;
    }

    public static String reverse(String str){

        String result = "";

        for (int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static String  removeDuplicates(String word){

        String result ="";
        for (String each : word.split("")){ // for( char each : word.toCharArray() ) ;
            if (!result.contains(each)){
                result+=each;
            }
        }
        return result;
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

    /*
    anagram
    "abbbaaccb" = "abc"
    "bbcaaccbba" = "abc"

    output= true
     */

    /*
    verify if two strings are anagram, returns the boolean result
     */
    public static boolean isAnagram (String str1, String str2){
        str1 = removeDuplicates(str1);
        str2 = removeDuplicates(str2);

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    /*
    verify if two strings are palindrome
     */
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    public static int frequencyWord(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;
    }
}
