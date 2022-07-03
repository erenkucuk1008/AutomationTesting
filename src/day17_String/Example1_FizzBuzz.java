package day17_String;

import java.util.Scanner;

public class Example1_FizzBuzz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.nextLine();

        System.out.println("Enter second word");
        String word2 = scan.nextLine();

        char ch1 = word1.charAt(word1.length()-1);
        char ch2 = word2.charAt(0);

        String result = "";
/*
        if (word1.length() == 5 && word2.length() == 5){
            if (ch1 == ch2){
                result = "Fizz";
            }else {
                result = "Buzz";
            }
        }else{
            System.out.println("words must be 5 characters");
        }
        System.out.println(result);

 */

        if (word1.length() == 5 && word2.length() == 5){
            if (word1.endsWith(""+word2.charAt(0)) && word2.startsWith(""+word1.charAt(word1.length()-1))){
                result = "Fizz";
            }else {
                result = "Buzz";
            }
        }else{
            System.out.println("words must be 5 characters");
        }
        System.out.println(result);

    }
}
