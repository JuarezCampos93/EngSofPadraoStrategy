public class ImpostoMG implements Imposto {


    @Override
    public float calcular(float value) {
        return value * 1.1f;
    }
}
