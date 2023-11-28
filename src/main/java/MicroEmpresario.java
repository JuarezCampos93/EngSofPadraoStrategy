public class Empresa {

    private float imposto;

    public float getImposto(){
        return this.imposto;
    }

    public void impostoMG(float lucro){
        Governo governo = new Governo(lucro);
        this.imposto = governo.calcularImposto(new ImpostoMG());
    }

    public void impostoSP(float lucro){
        Governo governo = new Governo(lucro);
        this.imposto = governo.calcularImposto(new ImpostoSP());
    }
}
