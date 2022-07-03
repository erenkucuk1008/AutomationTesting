package day17_String;

import java.util.Scanner;

public class WarmupTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = scan.nextLine();

        System.out.println("Enter second word");
        String word2 = scan.nextLine();


        //String word3 = word1.substring(1);
        //String word4 = word2.substring(1);

        String result = word1.substring(1) + word2.substring(1);

        //System.out.println(word3+""+word4);
        System.out.println(result);

    }
}
