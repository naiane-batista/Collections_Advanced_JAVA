package one.digitalinnovation.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes=new ArrayList<>();

        nomes.add("Heloísa");
        nomes.add("Nelcy");
        nomes.add("Jean");
        nomes.add("Alcimar");
        nomes.add("Noemi");
        nomes.add("Zacarias");

        System.out.println(nomes );

        nomes.set(2, "Naiane");//modificando posicao jean p naiane
        System.out.println(nomes );

        //ordem alfabetica
        Collections.sort(nomes);
        System.out.println(nomes );

        // set é um metodo d atualizacao, recebe um inteiro- indice e o seu elemento
        nomes.set(2,"maria");
        System.out.println(nomes );

        nomes.remove(4);//remove o indice 4- remove pelo indoce
        System.out.println(nomes );

        nomes.remove( "Heloísa");//remove o elemento- remove pelo nome
        System.out.println(nomes );

        String nome= nomes.get(1);//recebe um inteiro
        System.out.println(nome );

        int posicao =nomes.indexOf("Alcimar");//vai retornar o inidcie q a pessoa ta
        System.out.println(posicao );

        int tamanho =nomes.size();//tamanho
        System.out.println(tamanho );

        boolean temJoao=  nomes.contains("Joao");//retorna um boolean
        System.out.println(temJoao );

        boolean temAlcimar= nomes.contains("Alcimar");
        System.out.println(temAlcimar );

        boolean listaEstaVAzia= nomes.isEmpty();//false se nao estiver vazia e true se tiver
        System.out.println(listaEstaVAzia );


        for(String nomeDoItem:nomes){
            System.out.println("----->"+nomeDoItem );
            }

      Iterator< String>  itaretor= nomes.iterator();//retorna um iterartor de string
        while (itaretor.hasNext()){//hasNext retorna um boolean true sempre q existir mais um elemento na lista
            System.out.println("---->" +itaretor.next());

        }

        nomes .clear();
        listaEstaVAzia= nomes.isEmpty();
        System.out.println(listaEstaVAzia );




    }




    }
