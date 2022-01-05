package one.digitalinnovation.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundiaisFifa=new HashMap<>();

        campeoesMundiaisFifa.put("Brasil",5);
        campeoesMundiaisFifa.put("Alemnanha",4);
        campeoesMundiaisFifa.put("Italia",4);
        campeoesMundiaisFifa.put("Uruguai",2);
        campeoesMundiaisFifa.put("Argentina",2);
        campeoesMundiaisFifa.put("França",2);
        campeoesMundiaisFifa.put("Inglaterra",1);
        campeoesMundiaisFifa.put("Espanha",1);

        System.out.println(campeoesMundiaisFifa);


        //atualiza o valor para a chave brasil
        campeoesMundiaisFifa.put("Brasil",6);
        System.out.println(campeoesMundiaisFifa);

        //retorna a argentina
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        //retorna se existe ou nao um campeao frança
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //remove o campeao frança
        campeoesMundiaisFifa.remove("França");

        //retorns  se existe ou nao um campeao franca
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //retorna se existe ou nao alguma selecao hexacampea
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        //retorna o tamanho do mapa
        System.out.println(campeoesMundiaisFifa.size());
        System.out.println(campeoesMundiaisFifa);

        //navega nos registros do mapa
        for (Map.Entry<String,Integer> entry : campeoesMundiaisFifa.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        //navega nos registros do mapa
        for (String key:campeoesMundiaisFifa.keySet()){
            System.out.println(key+"--"+campeoesMundiaisFifa.get(key));
        }
            System.out.println(campeoesMundiaisFifa);

        //verifica se i mapa contem a chave estados unidos
        System.out.println(campeoesMundiaisFifa.containsKey("Estados Unidos"));

        //verifica se o mapa contem o valor 5
        System.out.println(campeoesMundiaisFifa.containsValue(5));

        //verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundiaisFifa.size());

        campeoesMundiaisFifa.clear();

        System.out.println(campeoesMundiaisFifa.size());






    }

}
