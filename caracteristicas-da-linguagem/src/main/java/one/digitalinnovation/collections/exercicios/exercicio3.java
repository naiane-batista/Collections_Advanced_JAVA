package one.digitalinnovation.collections.exercicios;

import java.util.TreeSet;

public class exercicio3 {
    public static void main(String[] args) {
        TreeSet <Integer> treeNumber=new TreeSet<>();

        treeNumber.add(3);
        treeNumber.add(88);
        treeNumber.add(20);
        treeNumber.add(44);
        treeNumber.add(3);

        // exibi apenas um dos itens repetidos
        System.out.println(treeNumber);

        //remova o primeiro itm do set

        treeNumber.remove(3);
        System.out.println(treeNumber);

        //navegando entr os itens
      /*  Iterator<Integer> iterator=treeNumber.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Integer num:treeNumber){
            System.out.println(num);
        }*/
    }
}
