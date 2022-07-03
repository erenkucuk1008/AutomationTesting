package day17_String;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.nextLine();
        System.out.println("Enter second word");
        String word2 = scan.nextLine();

        boolean isValid = word1.length() == 5 && word2.length() == 5;
        String result = "";

       /* if (isValid){
            char ch1 = word1.charAt(word1.length()-1);
            char ch2 = word2.charAt(0);

            if (ch1 == ch2){
                result = "Fizz";
            }else {
                result = "Buzz";
            }
        }else {
            System.out.println("Need to be exactly 5 characters in words");
        }
        System.out.println(result);

        */

        if (isValid){
            if (word1.endsWith( ""+word2.charAt(0) ) && word2.startsWith( ""+word1.charAt(word1.length()-1)) ){
                result = "Fizz";
            }else {
                result = "Buzz";
            }
        }else{
            System.out.println("Need at least 5 characters in words");
        }
        System.out.println(result);


    }
}
