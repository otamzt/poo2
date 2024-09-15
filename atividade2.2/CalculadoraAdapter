public class CalculadoraAdapter extends CalculadoraDecimal {
    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBin = calculadoraBinaria.somar(binA, binB);
        return Integer.parseInt(resultadoBin, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultadoBin = calculadoraBinaria.subtrair(binA, binB);
        return Integer.parseInt(resultadoBin, 2);
    }
}
