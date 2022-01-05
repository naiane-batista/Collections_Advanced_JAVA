package one.digitalinnovation.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercicioList {
    public static void main(String[] args) {
        List<String> listaNomes=new ArrayList<>();

        listaNomes.add("Juliana");
        listaNomes.add("Pedro");
        listaNomes.add("Carlos");
        listaNomes.add("Larisssa");
        listaNomes.add("Joao");
        listaNomes.add("Ismael");
        listaNomes.add("Rodrigo");

        System.out.println(listaNomes);

        //substitua nome carlos por roberto
        listaNomes.set(2, "Roberto");
        System.out.println(listaNomes);

        //retorne o nome da posicao 1
        String nome=listaNomes.get(1);
        System.out.println(nome);

        //remova o nome da posicao 4
        listaNomes.remove(4);
        System.out.println(listaNomes);

        //retornar a quantidade de itens na lista
        System.out.println(listaNomes.size());

        //verifica se o nome juliana existe na lista
        boolean temJuliana= listaNomes.contains("Juliana");
        System.out.println(temJuliana);

        //ordene os itens em ordens alfabeticas
        Collections.sort(listaNomes);
        System.out.println(listaNomes);

        //verificar se a lista esta vazia
       // System.out.println(listaNomes.isEmpty()); // ou

        boolean listaEstaVazia= listaNomes.isEmpty();
        System.out.println(listaEstaVazia);


    }


}
