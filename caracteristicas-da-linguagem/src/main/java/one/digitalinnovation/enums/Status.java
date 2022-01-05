package one.digitalinnovation.enums;

public enum Status {
    OPEN(13,"ABERTO"),
   CLOSE(03,"FECHADO");


    private int cod;
    private String texto;

    Status(final int cod, final String texto){
        this.cod=cod;
        this.texto=texto;
    }
    public int getCod(){
        return cod;
    }
    public String getTexto(){
        return texto;
    }

}
