package POO.Tdates.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String date = "2020-02-01";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);

        String hora = "12:34:56";
        LocalTime localTime = LocalTime.parse(hora);
        System.out.println(localTime);

        LocalDateTime localDateTime2 = localDate.atTime(localTime);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println(localDateTime3);

    }
}
