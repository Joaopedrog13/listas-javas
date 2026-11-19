import java.util.Scanner;

// Lista 04 - Exercício 3: jogo de adivinhação com do-while
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jogarNovamente;

        do {
            int numeroSecreto = (int) (Math.random() * 100) + 1;
            int palpite;
            int tentativas = 0;

            System.out.println("\n=== JOGO DA ADIVINHAÇÃO ===");
            System.out.println("Pensei em um número entre 1 e 100. Digite 0 para desistir.");

            do {
                System.out.print("Seu palpite: ");
                palpite = lerInteiro(sc);

                if (palpite == 0) {
                    System.out.println("Você desistiu. O número secreto era " + numeroSecreto + ".");
                } else if (palpite < 1 || palpite > 100) {
                    System.out.println("Palpite inválido! Digite um número de 1 a 100.");
                } else {
                    tentativas++;
                    if (palpite < numeroSecreto) {
                        System.out.println("O número secreto é MAIOR que " + palpite + ".");
                    } else if (palpite > numeroSecreto) {
                        System.out.println("O número secreto é MENOR que " + palpite + ".");
                    } else {
                        System.out.println("Parabéns! Você acertou o número " + numeroSecreto
                                + " em " + tentativas + " tentativa(s).");
                    }
                }
            } while (palpite != numeroSecreto && palpite != 0);

            do {
                System.out.print("Deseja jogar novamente? (s/n): ");
                jogarNovamente = sc.nextLine().trim().toLowerCase();
            } while (!jogarNovamente.equals("s") && !jogarNovamente.equals("n"));
        } while (jogarNovamente.equals("s"));

        System.out.println("Obrigado por jogar!");
        sc.close();
    }

    // Lê um inteiro; se não for número, retorna -1 (palpite inválido)
    static int lerInteiro(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
