package one.digitalinnovation.trabalhandoComDatas.exercicios;

import java.util.Calendar;
import java.util.Date;

//Passo 03: Implementação do método para converter a data validada do tipo Date para o tipo Calendar.
public class DateCalendar {
    public static Calendar dateToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
}
