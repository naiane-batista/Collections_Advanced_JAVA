package one.digitalinnovation.avancedJava;

import java.util.function.UnaryOperator;

public class ParadigmaFuncional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calucalarValorVezes3=valor->valor*3;//conceito programcao funcional
        int valor=10;
        System.out.println("O resultado é:: "+calucalarValorVezes3.apply(10));
    }
}
