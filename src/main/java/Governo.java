public class Governo {

    private float lucro;

    public Governo(float lucro){
        this.lucro = lucro;
    }

    public float calcularImposto(Imposto imposto){
        return imposto.calcular(this.lucro);
    }
}
