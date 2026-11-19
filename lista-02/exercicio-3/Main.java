import java.util.Scanner;

// Lista 02 - Exercício 3: preço do produto pelo código
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Sapato | 2 - Bolsa | 3 - Camisa | 4 - Calça | 5 - Blusa");
        int codigo = lerInt(sc, "Informe o código do produto: ");
        switch (codigo) {
            case 1: System.out.println("Sapato: R$ 99,99"); break;
            case 2: System.out.println("Bolsa: R$ 103,89"); break;
            case 3: System.out.println("Camisa: R$ 49,98"); break;
            case 4: System.out.println("Calça: R$ 89,72"); break;
            case 5: System.out.println("Blusa: R$ 97,35"); break;
            default: System.out.println("Código inválido! Use um código de 1 a 5.");
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
