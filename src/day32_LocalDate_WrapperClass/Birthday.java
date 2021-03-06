package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {
        LocalDate DofB = LocalDate.of(1998, 6, 11);

        HappyBirthDay(DofB.getMonthValue(), DofB.getDayOfMonth());

    }


    public static void HappyBirthDay(int month, int day){
        LocalDate birthday = LocalDate.of(1, month, day);
        LocalDate today = LocalDate.now();

        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();

        if(month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");
            System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
            return;
        }
        System.out.println("Today is not your birthday");
    }

}
