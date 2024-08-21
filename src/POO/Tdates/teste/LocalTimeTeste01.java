package POO.Tdates.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(6, 03, 50);
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(localTime.MIN);
        System.out.println(localTime.MAX);

        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTimeNow);
    }
}
