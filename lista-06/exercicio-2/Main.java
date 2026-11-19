import java.util.Scanner;

// Lista 06 - Exercício 2: soma de dois vetores de 10 posições
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10], b = new int[10], soma = new int[10];
        System.out.println("Vetor A:");
        for (int i = 0; i < 10; i++) a[i] = lerInt(sc, "  A[" + i + "] = ");
        System.out.println("Vetor B:");
        for (int i = 0; i < 10; i++) b[i] = lerInt(sc, "  B[" + i + "] = ");
        for (int i = 0; i < 10; i++) soma[i] = a[i] + b[i];
        System.out.println();
        imprimir("Vetor A    ", a);
        imprimir("Vetor B    ", b);
        imprimir("Vetor A + B", soma);
        sc.close();
    }

    static void imprimir(String nome, int[] v) {
        System.out.print(nome + ": ");
        for (int n : v) System.out.printf("%5d", n);
        System.out.println();
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
