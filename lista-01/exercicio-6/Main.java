import java.util.Scanner;

// Lista 01 - Exercício 6: hipotenusa pelo Teorema de Pitágoras
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = lerDouble(sc, "Informe o 1º cateto: ");
        double c = lerDouble(sc, "Informe o 2º cateto: ");
        double hipotenusa = Math.sqrt(b * b + c * c);   // a² = b² + c²
        System.out.printf("Hipotenusa: %.2f%n", hipotenusa);
        sc.close();
    }

    // Lê um número com validação (aceita vírgula ou ponto)
    static double lerDouble(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            String entrada = sc.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número.");
            }
        }
    }
}
