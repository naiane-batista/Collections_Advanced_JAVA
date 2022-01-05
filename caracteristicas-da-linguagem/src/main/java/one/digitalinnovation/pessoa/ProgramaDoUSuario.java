package one.digitalinnovation.pessoa;
import one.digitalinnovation.usuario.SuperUsuario;

public class ProgramaDoUSuario {
    public static void main(String[]args){
        final var batman=new SuperUsuario(
                "batman", "123");
        batman.getLogin();
       // batman.getSenha(); error é protecd,outro pacoTE
       // String nomeDoCliente=batman.nome; errror

 }

    }

