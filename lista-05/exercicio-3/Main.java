import java.util.Scanner;

// Lista 05 - Exercício 3: potência usando somente multiplicação (sem Math)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = lerInt(sc, "Informe a base: ");
        int expoente = lerInt(sc, "Informe o expoente (>= 0): ");
        while (expoente < 0) {
            System.out.println("Expoente inválido! Use um número maior ou igual a zero.");
            expoente = lerInt(sc, "Informe o expoente (>= 0): ");
        }
        long resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
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
