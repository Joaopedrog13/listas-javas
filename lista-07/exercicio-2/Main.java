import java.util.Scanner;

// Lista 07 - Exercício 2: soma de duas matrizes 2x2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = lerMatriz(sc, "Matriz A", 2);
        int[][] b = lerMatriz(sc, "Matriz B", 2);
        int[][] soma = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                soma[i][j] = a[i][j] + b[i][j];
        System.out.println("\nMatriz A:");
        imprimir(a);
        System.out.println("Matriz B:");
        imprimir(b);
        System.out.println("Matriz resultante (A + B):");
        imprimir(soma);
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
