package POO.Tdates.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1000000000000L);// Setando uma data em Milisegundos
        date.setTime(date.getTime() + 190000L);
        System.out.println(date);

    }
}
