/** Calculadora com as operações matemáticas básicas. */
public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    /** Divide a por b. Lança exceção se b for zero. */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    /** Base elevada ao expoente (aceita expoente negativo). */
    public double potencia(double base, int expoente) {
        double resultado = 1;
        for (int i = 0; i < Math.abs(expoente); i++) {
            resultado *= base;
        }
        return expoente < 0 ? 1 / resultado : resultado;
    }
}
