package day54_Map;

public class TestEnum {

    public static void main(String[] args) {

        String browserName = "Cybertek";

        Browsers browserName2 = Browsers.Firefox;

        switch (browserName2){

            case Chrome:
                System.out.println("Chrome browser is selected");
                break;

            case Firefox:
                System.out.println("Firefox browser is selected");
                break;

            default:
                System.out.println("Safari is selected");
        }

    }
}
