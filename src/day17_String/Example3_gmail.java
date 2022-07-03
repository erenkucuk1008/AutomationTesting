package day17_String;

import java.util.Scanner;

public class Example3_gmail {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an email address");
        String word1 = scan.nextLine();

        String result = "";

        if (word1.endsWith("@gmail.com")){
            result = "valid gmail account";
        }else{
            result = "invalid account";
        }
        System.out.println(result);
    }
}
