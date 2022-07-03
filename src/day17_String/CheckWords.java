package day17_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        if (word.length()==0){
            System.out.println("String is empty");
        }else if (word.length()>3){
            System.out.println(word.substring(word.length()-3));
        }else {
            System.out.println(word);
        }
    }
}
