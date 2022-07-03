package InterviewQuestions;

import java.util.Scanner;

public class DuplicatesCount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String word = scan.nextLine();
        System.out.println("Enter your char");
        char ch = scan.next().charAt(0);

        int count = 0;

        for (int i=0; i<=word.length()-1; i++){
            char each = word.charAt(i);
            if (each == ch){
                count++;
            }
        }
        System.out.println(ch+""+count);
    }
}
