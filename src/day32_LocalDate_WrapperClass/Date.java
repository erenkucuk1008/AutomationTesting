package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.util.Arrays;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2022,05,21);
        System.out.println(yesterday);

        System.out.println(yesterday.isLeapYear());

        LocalDate today = LocalDate.now();
        System.out.println(today);

        String[] names = {"Eren","Gurman","Hakan","Sevgi","suleyman"};
        LocalDate[] births = {
                LocalDate.of(1989,06,01),
                LocalDate.of(1995,05,06),
                LocalDate.of(1900,9,14),
                LocalDate.of(1800,10,22),
                LocalDate.of(1704, 12,29)
        };

        for (int i=0; i< names.length; i++){
            System.out.println(names[i]+"' birthday is: "+births[i]);
            System.out.println(names[i]+" was born on leap year: "+births[i].isLeapYear());
        }

    }
}
