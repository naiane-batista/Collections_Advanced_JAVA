package one.digitalinnovation.finals;

public class CasualGamer extends Gamer {

    @Override
    public String keyBoard(){

        return "simple Keyboard";
    }

    @Override
    public String mouse(){
        return super.mouse();//super faz referência a métodos ou atributos da super classe.
    }

    public String play(final String game){
        return "jogando "+game ;



    }

}
