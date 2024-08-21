package POO.Tdates.teste;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDate aniversario = LocalDate.of(2003, 6, 8);
        LocalDate now = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}
