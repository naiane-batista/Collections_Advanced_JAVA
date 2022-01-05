package one.digitalinnovation.trabalhandoComDatas.exercicios;

//Passo 04: Implementação do método para contar os dias que falta para o pagamento com base numa data do
// tipo Calendar e nas regras de negócios (RN) apontadas na descrição do problema.

import java.util.Calendar;

public class DiasPagar {
    public static int countDaysToPay(Calendar calendar){
        int countDaysToPay=10; //Tempo máximo para um cliente pagar a fatura após vencimento é 10 dias
        calendar.add(Calendar.DATE,countDaysToPay);

        int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);

        countDaysToPay += dayOfWeek == 1 ? 1 : 0;//: Se a data final de pagamento cair no domingo o tempo máximo deve ser prorrogado em 1 dias.
        countDaysToPay += dayOfWeek == 7 ? 2 : 0;//Se a data final de pagamento cair no sábado o tempo máximo deve ser prorrogado em 2 dias.

        return countDaysToPay;
    }

}
