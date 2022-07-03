package day18_ForLoop;

import java.util.Scanner;

public class Domain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address");
        String email = scan.nextLine();

        int index = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        String domain = email.substring(index+1,index2);  //gmail

        System.out.println("Your domain is : "+domain);
    }
}
