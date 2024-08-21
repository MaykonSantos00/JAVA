package POO.Wformatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String pattern = "h:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("7:35 AM"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
