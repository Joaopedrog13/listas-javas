import java.util.Scanner;

// Lista 01 - Exercício 1: média aritmética de três notas
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = lerDouble(sc, "Informe a 1ª nota: ");
        double n2 = lerDouble(sc, "Informe a 2ª nota: ");
        double n3 = lerDouble(sc, "Informe a 3ª nota: ");
        double media = (n1 + n2 + n3) / 3;
        System.out.printf("Média aritmética: %.2f%n", media);
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
