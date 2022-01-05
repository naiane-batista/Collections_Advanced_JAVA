package one.digitalinnovation.trabalhandoComDatas.exercicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Passo 02: Implementação do método para validar a data informada pelo usuário e convertê-la para o tipo Date.

public class ValidandoData {
    public static Date validateDate(String date){
        Date dateValidated = null;

        try{
            String dateFormat="dd/MM/yyyy";
            DateFormat df = new SimpleDateFormat(dateFormat);
            df.setLenient(false);
            dateValidated = df.parse(date);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Pattern!");
        }catch (ParseException e) {
            System.out.println("Invalid Pattern! The pattern is dd/MM/yyyy");
        }
        return dateValidated;
    }
}
