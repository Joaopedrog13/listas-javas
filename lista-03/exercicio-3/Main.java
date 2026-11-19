import java.util.Scanner;

// Lista 03 - Exercício 3: pesquisa de audiência de TV (termina com canal 0)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] canais = {2, 4, 5, 7, 12};
        int[] pessoasPorCanal = new int[canais.length];
        int total = 0;

        System.out.println("Canais: 2, 4, 5, 7 e 12. Digite 0 no canal para encerrar.");
        int canal = lerInt(sc, "\nCanal: ");
        while (canal != 0) {
            int indice = -1;
            for (int i = 0; i < canais.length; i++) {
                if (canais[i] == canal) indice = i;
            }
            if (indice == -1) {
                System.out.println("Canal inválido! Use 2, 4, 5, 7 ou 12.");
            } else {
                int pessoas = lerInt(sc, "Pessoas assistindo: ");
                while (pessoas < 0) {
                    System.out.println("Quantidade inválida! Digite 0 ou mais.");
                    pessoas = lerInt(sc, "Pessoas assistindo: ");
                }
                pessoasPorCanal[indice] += pessoas;
                total += pessoas;
            }
            canal = lerInt(sc, "\nCanal: ");
        }

        if (total == 0) {
            System.out.println("Nenhum telespectador foi informado.");
        } else {
            System.out.println("\nAudiência (total de " + total + " pessoas):");
            for (int i = 0; i < canais.length; i++) {
                double percentual = pessoasPorCanal[i] * 100.0 / total;
                System.out.printf("  Canal %2d: %5.1f%% (%d pessoas)%n", canais[i], percentual, pessoasPorCanal[i]);
            }
        }
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
