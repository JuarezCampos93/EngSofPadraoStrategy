public class ImpostoSP implements Imposto {
    @Override
    public float calcular(float value) {
        return value * 1.15f;
    }
}
