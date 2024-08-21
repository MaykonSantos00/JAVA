package POO.Wformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        DateFormat[] dateFormats = new DateFormat[7];
        dateFormats[0] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[1] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormats[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.FULL);
        dateFormats[4] = DateFormat.getInstance();
        dateFormats[5] = DateFormat.getDateInstance();
        dateFormats[6] = DateFormat.getDateTimeInstance();

        for (DateFormat dateFormat : dateFormats) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }
}
