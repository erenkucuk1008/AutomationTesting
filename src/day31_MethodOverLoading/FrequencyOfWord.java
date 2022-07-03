package day31_MethodOverLoading;

import library.StringUtility;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "Today is a great day, today we are learning Java, today we have java class.";
        int count = StringUtility.frequencyWord(str,"today");
        System.out.println(count);

        System.out.println("======================");

        String str2= "Java, jAVa, java, c#, C#";
        int countJava = StringUtility.frequencyWord(str2,"java");
        int countCSharp = StringUtility.frequencyWord(str2,"C#");
        System.out.println(countJava);
        System.out.println(countCSharp);

    }
    /*

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

     */
}
