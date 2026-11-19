import java.util.Scanner;

// Lista 06 - Exercício 1: operações com um vetor de 10 inteiros
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = lerInt(sc, "Informe o número da posição " + i + ": ");
        }
        // a) vetor lido
        System.out.print("\na) Vetor: ");
        for (int n : v) System.out.print(n + " ");
        System.out.println();
        // b) soma dos pares
        int somaPares = 0;
        for (int n : v) if (n % 2 == 0) somaPares += n;
        System.out.println("b) Soma dos números pares: " + somaPares);
        // c) posições com negativos
        System.out.print("c) Posições com números negativos: ");
        boolean temNegativo = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) { System.out.print(i + " "); temNegativo = true; }
        }
        System.out.println(temNegativo ? "" : "nenhuma");
        // d) menor e maior
        int menor = v[0], maior = v[0];
        for (int n : v) {
            if (n < menor) menor = n;
            if (n > maior) maior = n;
        }
        System.out.println("d) Menor: " + menor + " | Maior: " + maior);
        // e) elementos nas posições ímpares
        System.out.print("e) Elementos nas posições ímpares: ");
        for (int i = 1; i < v.length; i += 2) System.out.print(v[i] + " ");
        System.out.println();
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
