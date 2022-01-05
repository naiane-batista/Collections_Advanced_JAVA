package one.digitalinnovation.pessoa;

import one.digitalinnovation.cliente.Cliente;

public class ProgramaDoCliente {
    public static void main(String []args){

        final var cliente= new Cliente(18);
        cliente.getIdade();
        cliente.getPeso();

        System.out.println(cliente.relatorio());//acesso pq ta no mesmo pacote

    }
}
