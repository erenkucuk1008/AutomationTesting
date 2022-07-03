package InterviewQuestions;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a duplicate words");
        String str = scan.nextLine();

        String result = "";

        for (int i=0; i<=str.length()-1; i++){
            //String s = ""+str.charAt(i);           CHARAT METODU ILE
            String s = str.substring(i,i+1); //      SUBSTRING METODU ILE
            if (result.contains(s)){           // if(!result.contains(s)){
                continue;                      //    result += s;
            }
            result += s;
        }
        System.out.println(result);
    }
}
