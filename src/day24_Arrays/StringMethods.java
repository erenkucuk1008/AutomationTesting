package day24_Arrays;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "AABBDHJSKL";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("================================");

        String str1 = "DEBCA";
        String str2 = "ACBED";
        String str3 = "AASNDKL";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        //String[] ch3 = str3.split("");  char veya split metodla ayni seyi yapabiliriz.

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //Arrays.sort(ch3);

        //System.out.println(Arrays.toString(ch3));

        boolean r1 = Arrays.equals(ch1,ch2);
        System.out.println(r1); //true

        System.out.println("==============================");

        // reverse the sentence by word

        String sentence = "I Love Programming Language";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i>=0; i--){
            System.out.print(words[i]+" ");
        }

        System.out.println();
        System.out.println("=======================");

        String word = "JAVA";
        String[] reverse = word.split("");         // Every single character is STRING
        char[] ch5 = word.toCharArray();                // Every single character is CHAR
        System.out.println(Arrays.toString(reverse));
        System.out.println(Arrays.toString(ch5));

        for (int i= reverse.length-1; i>=0; i--){
            System.out.print(reverse[i]+"");
        }
    }
}
