package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2_ {

    public static void main(String[] args) {

        Scanner scan  =new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine().toLowerCase();

        int count = 0;
        while (str.contains("java")){
            count++;
            str = str.replaceFirst("java","");
        }
        System.out.println(count);
    }
}
