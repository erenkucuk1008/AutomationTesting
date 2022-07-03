package day14_Switch_Recap;

public class DaysInMonth {

    public static void main(String[] args) {

        int year = 2022 ;
        String month = "Feb";
        int days = 0;

        switch (month){
            case "Jan": days = 31;
                break;
            case "Feb": days = (year % 4 == 0) ? 29 : 28;
                break;
            case "Mar": days = 31;
                break;
            case "Apr": days = 30;
                break;
            case "May": days = 31;
                break;
            case "Jun": days = 30;
                break;
            case "Jul": days = 31;
                break;
            case "Aug": days = 31;
                break;
            case "Sep": days = 30;
                break;
            case "Oct": days = 31;
                break;
            case "Nov": days = 30;
                break;
            case "Dec": days = 31;
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println(days+" days");
    }
}
