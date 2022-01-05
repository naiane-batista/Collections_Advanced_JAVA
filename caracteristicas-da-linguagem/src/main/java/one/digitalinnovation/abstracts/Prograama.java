package one.digitalinnovation.abstracts;

public class Prograama {
    public static void main(String[]args) {

       // final FormaGeometrica formaGeometrica=new FormaGeometrica() {}nao instancia pq é abstrata a classe

        final  FormaGeometrica quadradro= new Quadrado("quadrado", 10.0 );

        //quando imprimir o quadrado, o metodo toString que sera impresso
        System.out.println(quadradro);

        System.out.println(quadradro.desenha(12,34));
        System.out.println(quadradro.nome());
        System.out.println(quadradro.area());


    }
    }
