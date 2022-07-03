package day14_Switch_Recap;

public class IfPractices {

    public static void main(String[] args) {

        double hourlyRate = 40;
        double weeklyHours = 352;
        int numberOfWeeks = 48;
        double salary = 0;

        if (hourlyRate >0){
            if (weeklyHours >0 && weeklyHours <=65){
                if (numberOfWeeks>1 && numberOfWeeks <=52){
                    salary = hourlyRate * weeklyHours * numberOfWeeks;
                    System.out.println("Your salary is : "+salary);
                }else{
                    System.err.println("Number of weeks are not \"less than 1 and more than 52\" ");
                }
            }else{
                System.err.println("Weekly hours are not be negative and more than 65");
            }
        }else {
            System.err.println("Hourly rate can not be negative"); // System.err hata raporu gibi kirmizi yaziyor.
        }
/*
        if (salary !=0){
            System.out.println("Your salary is : "+salary);     ya da 16.siraya sout la yazariz.
        }

 */

    }
}
