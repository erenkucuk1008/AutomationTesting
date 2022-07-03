package day33_ArrayList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_Task {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime dt1 = LocalDateTime.of(2020,11,24,13,00);
        System.out.println(dtf.format(dt1));
    }
}
