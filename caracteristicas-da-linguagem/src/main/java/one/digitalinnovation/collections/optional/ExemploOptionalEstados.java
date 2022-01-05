package one.digitalinnovation.collections.optional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional <String> optionalString= Optional.of("Valor presente");

        System.out.println("VALOR opcional que esta presente" );
        optionalString.ifPresentOrElse(System.out::println,()->System.out.println("Nao esta presente"));

        Optional<String> optionalNull=Optional.ofNullable(null);

        System.out.println("VALOR opcional que nao esta presente" );
        optionalNull.ifPresentOrElse(System.out::println,()->System.out.println("Null Nao esta presente"));

        Optional<String> emptyOPtional=Optional.empty();

        System.out.println("VALOR opcional que nao esta presente" );
        emptyOPtional.ifPresentOrElse(System.out::println,()->System.out.println("empty Nao esta presente"));

        Optional<String> optionalNullErro=Optional.of(null);

        System.out.println("VALOR opcional que lanca erro NulllPointerExcepption" );
        optionalNull.ifPresentOrElse(System.out::println,()->System.out.println("erro Nao esta presente"));


    }

}
