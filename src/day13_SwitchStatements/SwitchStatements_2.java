package day13_SwitchStatements;

public class SwitchStatements_2 {

    public static void main(String[] args) {

        String browser = "chrome";
        String selectedBrowser = "";

        switch (browser){
            case "chrome":
                selectedBrowser = " Chrome Selected";
                break;
            case "internet explorer":
                selectedBrowser = " Internet Explorer Selected";
                break;
            case "firefox":
                selectedBrowser = " Firefox Selected";
                break;
            case "safari":
                selectedBrowser = " Safari Selected";
                break;
            case "opera":
                selectedBrowser = " Opera Selected";
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println(selectedBrowser);
    }
}
