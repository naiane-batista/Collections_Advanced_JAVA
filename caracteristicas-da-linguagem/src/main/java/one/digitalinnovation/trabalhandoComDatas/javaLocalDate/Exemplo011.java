package one.digitalinnovation.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDate;

public class Exemplo011 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);//ONTEM=HOJE -1

        System.out.println(hoje);

        System.out.println(ontem);

    }

}
