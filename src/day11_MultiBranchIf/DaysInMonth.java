package day11_MultiBranchIf;

public class DaysInMonth {

    public static void main(String[] args) {

        int month = 2;
        boolean has28days = month ==2;
        boolean has30days = month==4 || month==6 || month==9 || month==11;
        //boolean has31days = month==1 || month==3 || month==5 || month==7 || month==8 || month==10||month==12;
        boolean has31days = !has28days && !has30days;
/*
        if (has28days){
            System.out.println("The month has 28 days.");
        }if (has30days){
            System.out.println("The month has 30 days.");
        }if (has31days){
            System.out.println("The month has 31 days.");
        }else {
            System.out.println("Please give a number between 1-12 !");
        }

 */
        int day = 0;

        if (has28days){
            day=28;
        }else if (has30days){
            day=30;
        }else {
            day=31;
        }
        System.out.println("The month has "+day+" days.");
    }
}
