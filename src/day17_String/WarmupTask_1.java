package day17_String;

import java.util.Scanner;

public class WarmupTask_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();
        char firstCh = word.charAt(0);
        char lastCh = word.charAt(word.length()-1);


        if (firstCh == lastCh){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
