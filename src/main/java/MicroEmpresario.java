public class MicroEmpresario {

    private float imposto;

    public float getImposto(){
        return this.imposto;
    }

    public void impostoMG(float lucro){
        Governo governo = new Governo(lucro);
        this.imposto = governo.calcularImposto(new ImpostoMG());
    }

    public void impostoPR(float lucro){
        Governo governo = new Governo(lucro);
        this.imposto = governo.calcularImposto(new ImpostoPR());
    }
}
