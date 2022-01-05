package one.digitalinnovation.collections.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class exercicioQueue {
    public static void main(String[] args) {
        Queue<String> filaLoja =new LinkedList<>();

        filaLoja.add("Daniel");
        filaLoja.add("Juliana");
        filaLoja.add("Pedro");
        filaLoja.add("Carlos");
        filaLoja.add("Larissa");
        filaLoja.add("Joao");


        System.out.println(filaLoja);

        //retorne o primeiro item da fila sem removelo
        String primeiroCliente= filaLoja.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaLoja);

        //retorne o primeiro item da fila removvendo o mesmo
        String clienteAserAtendido= filaLoja.poll();
        System.out.println(clienteAserAtendido);//cliente sendo atendido
        System.out.println(filaLoja);

        //retornando otamanho da lista
        System.out.println(filaLoja.size());

        //verificar se a lista esta vazia
        System.out.println(filaLoja.isEmpty());

       //verificar se  o nome carlos ta na lista
        boolean temCarlos=filaLoja.contains("Carlos");
        System.out.println(temCarlos);


    }


}
