package day14_Switch_Recap;

public class DaysInMonth_2 {

    public static void main(String[] args) {

        int year = 2022 ;
        String month = "Oct";
        int days = 0;

        switch (month){
            case "Feb": days = (year % 4 == 0) ? 29 : 28;
                        break;
            case "Jan":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
            case "Mar": days = 31;
                        break;
            case "Jun":
            case "Sep":
            case "Nov":
            case "Apr": days = 30;
                        break;
            default:
                System.out.println("Invalid");
        }
        System.out.println(days+" days");
    }
}
