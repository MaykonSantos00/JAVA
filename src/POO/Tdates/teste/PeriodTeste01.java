package POO.Tdates.teste;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTeste01 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate nowAfterTwoYers = LocalDate.now().plusYears(2).plusDays(10);
        Period period = Period.between(localDate, nowAfterTwoYers);
        System.out.println(period);

        Period period1 = Period.ofDays(10);
        System.out.println(period1);

        Period period2 = Period.ofMonths(10);
        System.out.println(period2);

        Period period3 = Period.ofWeeks(10);
        System.out.println(period3);

        Period period4 = Period.ofYears(10);
        System.out.println(period4);

        System.out.println(period3.getMonths());

        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(period3.getDays())).getMonths());
        System.out.println(localDate.until(localDate.plusDays(period3.getDays()), ChronoUnit.MONTHS));
    }
}
