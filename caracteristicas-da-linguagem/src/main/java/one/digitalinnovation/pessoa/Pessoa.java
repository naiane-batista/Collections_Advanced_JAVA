package one.digitalinnovation.pessoa;

public class Pessoa {
    private Integer idade;
    private Float peso;

    public Pessoa(){//construtor vazio
    }
    public Pessoa(final Integer idade){

        this.idade=idade;
    }
     public Pessoa(final Integer idade, final Float peso){
        this.idade=idade;
        this.peso=peso;
    }
    public Integer getIdade(){
        return this.idade=idade;
    }
    public Float getPeso(){

        return this.peso=peso;
    }
    protected String relatorio (){
    return "idade: "+idade+ "e peso: " +peso ; //idade: $idade e peso: $peso



    }


}
