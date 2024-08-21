package POO.Tdates.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        c.add(Calendar.DAY_OF_WEEK, 0);
        c.roll(Calendar.DAY_OF_MONTH, 0);
        Date date = c.getTime();
        System.out.println(date);

        if (c.getFirstDayOfWeek() == Calendar.SATURDAY) {
            System.out.println("Sabadou");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));

    }
}
