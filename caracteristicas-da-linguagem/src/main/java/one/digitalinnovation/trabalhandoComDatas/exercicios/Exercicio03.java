package one.digitalinnovation.trabalhandoComDatas.exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

//Converta a data atual no formato DD/MM/YYYY HH:MM:SS:MMM.
public class Exercicio03 {
    public static void main(String[] args) {
        Date agora=new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");
        String dataFormatada  =formatter.format(agora);
        System.out.println(dataFormatada);


    }
}
