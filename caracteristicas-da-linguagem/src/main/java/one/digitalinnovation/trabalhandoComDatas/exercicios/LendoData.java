package one.digitalinnovation.trabalhandoComDatas.exercicios;

import java.util.Scanner;

//Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam cobrados.
//
//Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.
//
//Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.

public class LendoData {
    public static String readDate() {

        Scanner scanner = new Scanner(System.in);

            //Passo 01: Implementação do método para ler um data como uma String a partir do console.
        // É obrigatório que o usuário informe a data de acordo com o formato proposto.

        System.out.println("Enter with the due date in the format dd/MM/yyyy:");
        String date=scanner.nextLine();
        scanner.close();
        return date;
    }
}
