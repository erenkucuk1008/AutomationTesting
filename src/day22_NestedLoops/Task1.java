package day22_NestedLoops;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.nextLine();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);

        boolean start = ch1 >= 'A' && ch1 <= 'Z';
        boolean ends = ch2 >= 'a' && ch2 <= 'z';

        if (start && ends){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
