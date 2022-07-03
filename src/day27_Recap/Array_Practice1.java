package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {

    public static void main(String[] args) {

        String[] names = {"Eren","Arzum","Nadav","Eriksenn"};

        System.out.println(names[0]);

        System.out.println("=================================");

        for (String s : names){
            if (! s.startsWith("E")){
                continue;
            }
            System.out.println(s);
        }

        for (int i=0; i<=names.length-1; i++){
            if (! names[i].startsWith("E")){
                continue;
            }
            System.out.println(names[i]);
        }

        System.out.println("===================================");

        String[] sample = new String[5];
        System.out.println(sample);
        System.out.println(Arrays.toString(sample));

        System.out.println("==================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you wanna enter?");
        String[] students = new String[scan.nextInt()];
        scan.nextLine();
        for (int i=0; i<=students.length-1; i++){
            System.out.println("Enter a name");
            students[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(students));
    }
}
