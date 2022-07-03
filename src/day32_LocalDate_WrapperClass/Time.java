package day32_LocalDate_WrapperClass;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(2,23,44);
        System.out.println(t1);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println("================================");

        LocalDateTime dt1 = LocalDateTime.of(2022,1,11,22,49);
        System.out.println(dt1);

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
    }
}
