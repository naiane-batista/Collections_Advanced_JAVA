package one.digitalinnovation.abstracts;

public abstract class FormaGeometrica {
    public abstract String nome();
    public abstract Double area();

    public String desenha(int x, int y){//nao é abstrato,tem um corpo
        return "desenhando nas coordenadas X = " +x + "Y=" +y;
    }
}
