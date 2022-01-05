package one.digitalinnovation.collections.comparators;

import java.util.*;

public class ComparatordExampleList {
    public static void main(String[] args) {
        List<Estudante> estudantes=new ArrayList<>();

        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",20));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("Larissa",21));

        System.out.println("---Ordem de inserção---" );
        System.out.println(estudantes);

        estudantes.sort((first, second)-> first.getIdade()-second.getIdade());

        System.out.println("---Ordem natural dos numeros- idade---" );
        System.out.println(estudantes);

        estudantes.sort((first, second)-> second.getIdade()- first.getIdade());

        System.out.println("---Ordem reversa dos numeros -idade---" );
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("---Ordem natural dos numeros-idade (method reference--" );
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());//revere a ordem

        System.out.println("---Ordem reversa dos nimeros- idade(method reference)---" );
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("---Ordem natural dos numeros- idade(interface comparable)---" );
        System.out.println(estudantes);

        Collections.sort(estudantes,new EstudanteOrdemIdadeReversaComparator());

        System.out.println("---Ordem dos numeros- idade(Interface commparator)--" );
        System.out.println(estudantes);

    }
}
