package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

    /*
       LocalDate:
           year: yyyy(full year), yy(last two number)
           month: MM(number) , MMM(3 letters of month), MMMM(Full name)
           day: dd

           name of day: E(3 letters of day), EEEE(full name)
        */

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yy, EEEE");

        LocalDate today = LocalDate.now();
        System.out.println(today);             // 2022-06-12
        System.out.println(today.format(df));  // June/12/22 Sunday

        System.out.println("==================================");

        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalTime now = LocalTime.now();
        System.out.println(now);            // 09:30:03.600
        System.out.println(now.format(t1)); // 09:30:03 AM

        LocalTime lt1 = LocalTime.of(23,55,45);
        System.out.println(lt1);             //23:55:45
        System.out.println(lt1.format(t1));  //11:55:45 PM

        System.out.println("==================================");

        // Monday, 12:40PM, Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime dt1 = LocalDateTime.of(2020,11,23,12,40);
        System.out.println(dt1);
        System.out.println(dt1.format(dtf));

        System.out.println("=================================");

        LocalDate tomorrow = LocalDate.of(2022,6,13);
        System.out.println(tomorrow.format(df));

        boolean r1 = today.isBefore(tomorrow);
        boolean r2 = today.isAfter(tomorrow);

        System.out.println(r1);
        System.out.println(r2);

        //calculate the age
        int currentYear = LocalDate.now().getYear();
        LocalDate dofB = LocalDate.of(1989,06,01);

        int age = currentYear - dofB.getYear();
        System.out.println(age);

        System.out.println(dofB.plusDays(10));    // added 10 days

        LocalDate rightNow = LocalDate.now();
        LocalDate holidays = rightNow.plusDays(5); // added 5 days
        System.out.println(holidays);

        LocalTime time = LocalTime.now();
        LocalTime breakTime = time.plusMinutes(15);
        System.out.println(breakTime);
        System.out.println(breakTime.format(t1));

        System.out.println("=========================================");

        LocalTime classStarts = LocalTime.of(10,00);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println(firstBreak);
        System.out.println(firstBreak.format(t1));

    }
}
