package one.digitalinnovation.trabalhandoComDatas.exercicios;

import java.util.Date;
//Descubra o timeInMillis do dia que você nasceu;
//
//Converta em um objeto Date;
//
//Verifique se ele é anterior ou posterior ao dia 15 de Maio de 2010.


public class Exercicio01 {
    public static void main(String[] args) {
        Long currentTimeMillis=637210800000L; //12/03/1990
        Date birthDay = new Date(currentTimeMillis);

        Date referenceDate =new Date(1273892400000L);//15/05/2010

        boolean isAfter =birthDay.after(referenceDate);
        boolean isBefore=birthDay.before(referenceDate);

        String str = isAfter ? "is after" : "is before";
        System.out.println(birthDay + " " + str + " to " + referenceDate);






    }
}
