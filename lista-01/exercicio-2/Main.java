import java.util.Scanner;

// Lista 01 - Exercício 2: novo salário com aumento de 25%
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = lerDouble(sc, "Informe o salário do funcionário: R$ ");
        double novoSalario = salario * 1.25;
        System.out.printf("Novo salário (aumento de 25%%): R$ %.2f%n", novoSalario);
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
