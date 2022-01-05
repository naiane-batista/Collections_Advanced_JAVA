package one.digitalinnovation.collections.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes =new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetbol");
        esportes.add("Tênis de mesa");
        esportes.add("Handebol");

        //altera  a posicao 2 do valor
        esportes.set(2,"Ping Pong");

        //remve o esporte da posicao 2
        esportes.remove(2);

        //remove o esprte(Handebol) do vetor
        esportes.remove("Handebol");

        //retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //navega nos esportes
        for (String esporte:esportes){
            System.out.println(esporte);
        }
    }
}
