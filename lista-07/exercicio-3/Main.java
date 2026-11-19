import java.util.Scanner;

// Lista 07 - Exercício 3: matriz 6x6, soma das colunas pares e ímpares
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = lerMatriz(sc, "Matriz", 6);
        int somaPares = 0, somaImpares = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j % 2 == 0) somaPares += m[i][j];
                else somaImpares += m[i][j];
            }
        }
        System.out.println("\na) Matriz informada:");
        imprimir(m);
        System.out.println("b) Soma das colunas pares (0, 2, 4): " + somaPares);
        System.out.println("c) Soma das colunas ímpares (1, 3, 5): " + somaImpares);
        System.out.println("d) Diferença (pares - ímpares): " + (somaPares - somaImpares));
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
