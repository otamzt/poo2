public class Main {
    public static void main(String[] args) {
        CalculadoraDecimal calculadoraDecimal = new CalculadoraDecimal();
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();
        CalculadoraAdapter calculadoraAdaptada = new CalculadoraAdapter(calculadoraBinaria);

        // Operações decimais
        System.out.println("Operações decimais:");
        System.out.println("Soma: " + calculadoraDecimal.somar(10, 5));  // 15
        System.out.println("Subtração: " + calculadoraDecimal.subtrair(10, 5));  // 5
        System.out.println("Multiplicação: " + calculadoraDecimal.multiplicar(10, 5));  // 50

        // Operações binárias adaptadas
        System.out.println("\nOperações binárias através do adaptador:");
        System.out.println("Soma (binária adaptada para decimal): " + calculadoraAdaptada.somar(10, 5));  // 15
        System.out.println("Subtração (binária adaptada para decimal): " + calculadoraAdaptada.subtrair(10, 5));  // 5
    }
}
