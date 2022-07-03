package day17_String;

import java.util.Scanner;

public class Example4_WebSite {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a website");
        String word1 = scan.nextLine();

        String result = "";

        if (word1.startsWith("www.")){
            result = "valid website";
        }else{
            result = "invalid website";
        }
        System.out.println(result);
    }
}
