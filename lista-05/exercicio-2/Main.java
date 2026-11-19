import java.util.Scanner;

// Lista 05 - Exercício 2: média de uma quantidade indeterminada de idades
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as idades. Para terminar, digite um número negativo.");
        int soma = 0, quantidade = 0;
        for (int idade = lerInt(sc, "Idade: "); idade >= 0; idade = lerInt(sc, "Idade: ")) {
            soma += idade;
            quantidade++;
        }
        if (quantidade == 0) {
            System.out.println("Nenhuma idade foi informada.");
        } else {
            System.out.printf("Idades informadas: %d%nMédia das idades: %.2f%n", quantidade, (double) soma / quantidade);
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
