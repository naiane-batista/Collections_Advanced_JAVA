package one.digitalinnovation.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //monta a  arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Sao Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a a primeria capital no topo da arvore
        System.out.println(treeCapitais.first());

        //retorna a a ultima capital no final da arvore
        System.out.println(treeCapitais.last());

        //retorna  a primeria capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //exibe todas as capitais
        System.out.println(treeCapitais);

        //navega em todos os itens do iterator
        Iterator<String>iterator=treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        for (String capital: treeCapitais){
            System.out.println(capital);

        }


    }
}
