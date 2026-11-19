import java.util.Scanner;

// Lista 03 - Exercício 2: situação de cada aluno pela média (termina com matrícula negativa)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a matrícula e as três notas de cada aluno. Matrícula negativa encerra.");
        int matricula = lerInt(sc, "\nMatrícula: ");
        while (matricula >= 0) {
            double soma = 0;
            for (int i = 1; i <= 3; i++) {
                double n = lerDouble(sc, "  Nota " + i + " (0 a 100): ");
                while (n < 0 || n > 100) {
                    System.out.println("  Nota inválida! A nota vai de 0 a 100.");
                    n = lerDouble(sc, "  Nota " + i + " (0 a 100): ");
                }
                soma += n;
            }
            double media = soma / 3;
            String situacao;
            if (media >= 70) {
                situacao = "APROVADO";
            } else if (media >= 60) {
                situacao = "EM RECUPERAÇÃO";
            } else {
                situacao = "REPROVADO";
            }
            System.out.printf("  Aluno %d: média %.2f - %s%n", matricula, media, situacao);
            matricula = lerInt(sc, "\nMatrícula: ");
        }
        System.out.println("Fim do programa.");
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

    // Lê um número inteiro com validação
    static int lerInt(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
            }
        }
    }
}
