import java.util.Scanner;

// Lista 05 - Exercício 1: fatorial com for
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lerInt(sc, "Informe um número natural: ");
        if (n < 0) {
            System.out.println("Número inválido! O fatorial só existe para números naturais (n >= 0).");
        } else if (n > 20) {
            System.out.println("Número muito grande! Informe um valor de 0 a 20.");
        } else {
            long fatorial = 1;
            String conta = "";
            for (int i = n; i >= 1; i--) {
                fatorial *= i;
                conta += (i == n ? "" : " x ") + i;
            }
            if (n == 0) conta = "1 (por definição)";
            System.out.println(n + "! = " + conta + " = " + fatorial);
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
