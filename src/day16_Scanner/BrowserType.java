package day16_Scanner;

import java.util.Scanner;

public class BrowserType {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a browser type: Firefox - Safari - Chrome - Opera - Internet Explorer");
        String browserType = scan.nextLine();
        scan.close();

        boolean isValid = browserType.equals("Firefox") || browserType.equals("Safari") ||
                browserType.equals("Opera") || browserType.equals("Internet Explorer");

        if (isValid){
            System.out.println(browserType+" is valid");
        }else {
            System.out.println("INVALID");
        }

        /*
        switch (browserType){
            case "Firefox":
                System.out.println("Firefox is valid");                SWITCH CASE ILE YAZILISI
                break;
            default:
                System.out.println("INVALID");
        }

         */


    }
}
