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

        String monthName = "Python";
        MonthName monthName1 = MonthName.Jun;

        String dayInWeek = "Eren";
        DaysInWeek day = DaysInWeek.Fri;

        ComputerOS os = ComputerOS.Windows;

        Priority priorityLevel = Priority.High;

        System.out.println("===========================================");
        String string = "Cybertek";
        string.concat(" School"); // "Cybertek School"
        System.out.println(string);  // "Cybertek"

        StringBuilder stringBuilder = new StringBuilder("Cybertek");
        stringBuilder.append(" School");
        stringBuilder.reverse();
        System.out.println(stringBuilder);



    }
}
