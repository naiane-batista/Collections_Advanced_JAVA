package one.digitalinnovation.avancedJava;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor=20;
        UnaryOperator<Integer> retornarDobro= v->v*2;//produzindo um novo valor
        System.out.println(retornarDobro.apply(valor));//retorna dobro do valor
        System.out.println(valor);//valor nao sera alterado

    }

}
