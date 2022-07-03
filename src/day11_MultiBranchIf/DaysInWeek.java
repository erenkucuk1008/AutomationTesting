package day11_MultiBranchIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int day = 2;
        //boolean monday = day==1;
        boolean tuesday = day==2;
        boolean wednesday = day==3;
        boolean thursday = day==4;
        boolean friday = day==5;
        boolean saturday = day==6;
        boolean sunday = day==7;

        String days = "";
        if (day>=1 && day<=7){
            if (day==1){           // boolean yazmadan day==1 olarak da yazabiliriz
                days = "Monday";
            }else if (tuesday){
                days="Tuesday";
            }else if (wednesday){
                days="Wednesday";
            }else if (thursday){
                days="Thursday";
            }else if (friday){
                days="Friday";
            }else if (saturday){
                days="Saturday";
            }else {
                days="Sunday-Funday";
            }
            System.out.println("The day is "+days);
        }else{
            System.out.println("Please give a number between 1-7");
        }

        System.out.println(day==1 ? "Monday" : day==2 ? "Tuesday" : "Canim skildi");


    }
}
