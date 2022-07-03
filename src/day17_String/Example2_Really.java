package day17_String;

import java.util.Scanner;

public class Example2_Really {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = scan.nextLine();

        String result = "";

        if (word1.endsWith("ly")){
            result = "really";
        }else{
            result = "never mind";
        }
        System.out.println(result);
    }
}
