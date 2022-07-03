package day19_ForLoop;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Put your words to reverse it");
        String str = scan.nextLine();

        String result = "";
        for (int i = str.length()-1 ; i>=0 ; i--){
            result += str.charAt(i);
            //result += str.substring(i,i+1);    SUBSTRING METHOD ILE
        }
        System.out.println(result);
    }
}
