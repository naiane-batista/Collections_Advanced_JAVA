package one.digitalinnovation.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
    Queue<String> filaBanco= new LinkedList<>();

    filaBanco.add("Pamela");//primeira na fila
    filaBanco.add("Patricia");
    filaBanco.add("Roberto");
    filaBanco.add("Flavio");
    filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteAserAtendido=filaBanco.poll();// poll vai remover o primeio da fila
        System.out.println(clienteAserAtendido);//primeiro da fila sendo atendido
        System.out.println(filaBanco);

        //saber quem ta na vez na fila, saber onde estar sem remover
        String primeiroCliente=filaBanco.peek();//se a fila estiver vazia retorna null
        System.out.println(primeiroCliente);//mostra quem ta na vez sem remover
        System.out.println(filaBanco);

       // filaBanco.clear(); //limpando

        // a fila nao pode esta vazia pra fazer uma chamada se tiver vai retornar um erro
        String  primeiroClienteOuErro=filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println(client);
        }
         Iterator<String> iteratorFilaBAnco =filaBanco.iterator();

        while (iteratorFilaBAnco.hasNext()){
            System.out.println("----->"+iteratorFilaBAnco.next());
        }
        System.out.println(filaBanco.size());

       // System.out.println(filaBanco.isEmpty());


    }
}
