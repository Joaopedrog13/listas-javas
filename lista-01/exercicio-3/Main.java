import java.util.Scanner;

// Lista 01 - Exercício 3: área de um losango
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diagonalMaior = lerDouble(sc, "Informe a diagonal maior: ");
        double diagonalMenor = lerDouble(sc, "Informe a diagonal menor: ");
        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.printf("Área do losango: %.2f%n", area);
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
