package one.digitalinnovation.interfaces;

public class Fiesta implements Carro,Veiculo{//heranca multipla

    @Override
    public String marca(){
        return "Ford";
    }
    @Override
    public String registro(){
        return "dsbhbds";
    }
    @Override
    public void ligar(){
        Carro.super.ligar();

        Veiculo.super.ligar();
    }

}
