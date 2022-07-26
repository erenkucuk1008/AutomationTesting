package day45_Exceptions;

public class Driver {

    public static void main(String[] args) {

        String browserName = "CHROME";

        switch (browserName.toLowerCase()) {
            case "chrome":
                System.out.println("Chrome is selected");
                break;

            case "firefox":
                System.out.println("FireFox is selected");
                break;

            case "safari":
                System.out.println("Safari is selected");
                break;

            case "opera":
                System.out.println("Opera is selected");
                break;

            default:
                throw new RuntimeException("No Such a Browser Name " + browserName);
        }

    }
}