import java.util.Scanner;

// Lista 02 - Exercício 1: situação do aluno pela média de 3 notas
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 3; i++) {
            double nota = lerDouble(sc, "Informe a " + i + "ª nota (0 a 10): ");
            while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                nota = lerDouble(sc, "Informe a " + i + "ª nota (0 a 10): ");
            }
            soma += nota;
        }
        double media = soma / 3;
        String mensagem;
        if (media < 3) {
            mensagem = "REPROVADO";
        } else if (media < 7) {
            mensagem = "EXAME";
        } else {
            mensagem = "APROVADO";
        }
        System.out.printf("Média: %.2f - %s%n", media, mensagem);
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
