package one.digitalinnovation.avancedJava;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer>verficarSeMaior=
                (parametro,valorComparacao)->parametro>valorComparacao;

        //me retorna dois trues
        System.out.println(verficarSeMaior.test(13,12));
        System.out.println(verficarSeMaior.test(13,12));
    }
}
