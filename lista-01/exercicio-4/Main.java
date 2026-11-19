import java.util.Scanner;

// Lista 01 - Exercício 4: Celsius para Fahrenheit
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = lerDouble(sc, "Informe a temperatura em Celsius: ");
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f °C = %.2f °F%n", celsius, fahrenheit);
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
