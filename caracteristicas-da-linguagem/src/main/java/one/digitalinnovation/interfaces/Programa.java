package one.digitalinnovation.interfaces;

public class Programa {
    public static void main(String[]args){

        final Gol gol=new Gol();//alem de ser um gol é um Carro tbm
        System.out.println("Marca do gol "+gol.marca());
        gol.ligar();//chamando metodo ligar

         final Trator trator=new Trator();
        System.out.println("Registro do trator : "+trator.registro());
        trator.ligar();

        final Fiesta fiesta=new Fiesta();
        System.out.println("Marca do Fiesta : "+fiesta.marca());
        System.out.println("Rrgistro do fiesta : "+fiesta.registro());



    }
}
