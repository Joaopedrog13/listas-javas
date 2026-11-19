import java.util.Scanner;

// Lista 06 - Exercício 3: soma das duas metades de um vetor
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = lerInt(sc, "Informe o número da posição " + i + ": ");
        }
        int somaPrimeira = 0, somaSegunda = 0;
        for (int i = 0; i < 5; i++) somaPrimeira += v[i];
        for (int i = 5; i < 10; i++) somaSegunda += v[i];
        int diferenca = somaPrimeira - somaSegunda;
        System.out.println("\na) Soma da primeira metade: " + somaPrimeira);
        System.out.println("b) Soma da segunda metade: " + somaSegunda);
        System.out.println("c) Diferença (primeira - segunda): " + diferenca);
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
