import java.util.Scanner;

// Lista 01 - Exercício 5: quantos salários mínimos o funcionário recebe
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo = lerDouble(sc, "Informe o valor do salário mínimo: R$ ");
        double salario = lerDouble(sc, "Informe o salário do funcionário: R$ ");
        double quantidade = salario / salarioMinimo;
        System.out.printf("O funcionário recebe %.2f salários mínimos.%n", quantidade);
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
