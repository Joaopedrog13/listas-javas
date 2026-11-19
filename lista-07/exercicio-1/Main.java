import java.util.Scanner;

// Lista 07 - Exercício 1: matriz 5x5 e elementos de linha par e coluna ímpar
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = lerMatriz(sc, "Matriz", 5);
        System.out.println("\na) Matriz informada:");
        imprimir(m);
        System.out.println("\nb) Elementos com índice de linha par e de coluna ímpar:");
        for (int i = 0; i < 5; i += 2) {
            for (int j = 1; j < 5; j += 2) {
                System.out.println("   m[" + i + "][" + j + "] = " + m[i][j]);
            }
        }
        sc.close();
    }

    // Lê uma linha inteira da matriz: os números separados por espaço
    static int[] lerLinha(Scanner sc, String msg, int tamanho) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            String[] partes = sc.nextLine().trim().split("\\s+");
            if (partes.length != tamanho) {
                System.out.println("Digite exatamente " + tamanho + " números separados por espaço.");
                continue;
            }
            try {
                int[] linha = new int[tamanho];
                for (int i = 0; i < tamanho; i++) linha[i] = Integer.parseInt(partes[i]);
                return linha;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite apenas números inteiros.");
            }
        }
    }

    // Lê todas as linhas de uma matriz n x n
    static int[][] lerMatriz(Scanner sc, String nome, int n) {
        int[][] m = new int[n][];
        System.out.println(nome + " (" + n + "x" + n + "): digite cada linha com " + n + " números separados por espaço.");
        for (int i = 0; i < n; i++) m[i] = lerLinha(sc, "  Linha " + i + ": ", n);
        return m;
    }

    static void imprimir(int[][] m) {
        for (int[] linha : m) {
            for (int x : linha) System.out.printf("%5d", x);
            System.out.println();
        }
    }
}
