import java.util.Locale;
import java.util.Scanner;

// Lista 16 - Exercício 2: enum TipoFrete com switch para calcular o total
public class Main {

    enum TipoFrete {
        ECONOMICO, EXPRESSO, RETIRADA
    }

    private static final Locale BR = Locale.forLanguageTag("pt-BR");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TipoFrete tipo = null;
        while (tipo == null) {
            System.out.print("Tipo de frete (ECONOMICO, EXPRESSO ou RETIRADA): ");
            if (!sc.hasNextLine()) return;
            String entrada = sc.nextLine().trim().toUpperCase(Locale.ROOT);
            try {
                tipo = TipoFrete.valueOf(entrada);
            } catch (IllegalArgumentException e) {
                System.out.println("Opção inválida! Digite ECONOMICO, EXPRESSO ou RETIRADA.");
            }
        }

        double valorProduto = -1;
        while (valorProduto < 0) {
            System.out.print("Valor do produto: R$ ");
            if (!sc.hasNextLine()) return;
            try {
                valorProduto = Double.parseDouble(sc.nextLine().trim().replace(",", "."));
                if (valorProduto < 0) System.out.println("O valor não pode ser negativo.");
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número.");
            }
        }
        sc.close();

        double frete = switch (tipo) {
            case ECONOMICO -> 12.50;
            case EXPRESSO -> 25.00;
            case RETIRADA -> 0.00;
        };
        double total = valorProduto + frete;

        System.out.println("\nFrete: " + tipo);
        System.out.println("Valor do frete: R$ " + String.format(BR, "%.2f", frete));
        System.out.println("Total: R$ " + String.format(BR, "%.2f", total));
    }
}
