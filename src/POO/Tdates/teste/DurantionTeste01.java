package POO.Tdates.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurantionTeste01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime nowAfterTwoYers = LocalDateTime.now().plusYears(2).plusMinutes(10);
        Duration duration = Duration.between(localDateTime, nowAfterTwoYers);
        System.out.println(duration);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinutes7Hours = LocalTime.now().plusHours(7).plusMinutes(10);
        Duration duration2 = Duration.between(timeNow, timeMinutes7Hours);
        System.out.println(duration2);

        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(duration3);

        Duration duration4 = Duration.ofDays(365);
        System.out.println(duration4);

        Duration duration5 = Duration.ofHours(365);
        System.out.println(duration5);

        Duration duration6 = Duration.of(3, ChronoUnit.MINUTES);
        System.out.println(duration6);
    }
}
