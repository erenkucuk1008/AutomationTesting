package day13_SwitchStatements;

public class WarmupTasks {

    public static void main(String[] args) {

        int year = 2024;
        int number = 12;
        boolean has28Days = number ==2;
        boolean has30Days = number == 4 || number ==6 || number==9 || number==11;
        int day=0;

        if (number>=1 && number<=12){


            if (has28Days){
                if (year%4==0){
                    day=29;
                }else{
                    day=28;
                }
            }else if (has30Days){
                day=30;
            }else {
                day=31;
            }
            System.out.println("Days : "+day);


        }else {
            System.out.println("Put a number between 1-12");

        }



    }
}
