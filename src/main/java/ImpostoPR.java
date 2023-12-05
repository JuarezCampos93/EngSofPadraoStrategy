public class ImpostoPR implements Imposto {
    @Override
    public float calcular(float value) {
        return value * 1.4f;
    }
}
