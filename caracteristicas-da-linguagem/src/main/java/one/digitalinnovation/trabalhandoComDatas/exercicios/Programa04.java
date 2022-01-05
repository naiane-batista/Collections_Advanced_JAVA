package one.digitalinnovation.trabalhandoComDatas.exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa04 {
    public static String format(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
