import java.util.Scanner;

// Lista 02 - Exercício 2: situação do peso pelo IMC
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso = lerDouble(sc, "Informe o peso (kg): ");
        while (peso <= 0) {
            System.out.println("Peso inválido! Digite um valor maior que zero.");
            peso = lerDouble(sc, "Informe o peso (kg): ");
        }
        double altura = lerDouble(sc, "Informe a altura (m): ");
        while (altura <= 0) {
            System.out.println("Altura inválida! Digite um valor maior que zero.");
            altura = lerDouble(sc, "Informe a altura (m): ");
        }
        double imc = peso / (altura * altura);
        String situacao;
        if (imc < 20) {
            situacao = "Abaixo do Peso";
        } else if (imc < 25) {
            situacao = "Normal";
        } else if (imc < 30) {
            situacao = "Sobrepeso";
        } else if (imc <= 40) {
            situacao = "Obesidade";
        } else {
            situacao = "Obesidade Mórbida";
        }
        System.out.printf("IMC: %.2f - %s%n", imc, situacao);
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
