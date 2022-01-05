package one.digitalinnovation.trabalhandoComDatas.exercicios;

import java.time.LocalDateTime;

//Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00.
public class Exercicio04 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2010, 5, 15, 10, 0, 0);

        LocalDateTime future = localDateTime.plusYears(4).plusMonths(6).plusHours(13);

        //System.out.println(format(localDateTime));
        System.out.println(localDateTime);


        //System.out.println(format(future));
        System.out.println(future);

    }

}
