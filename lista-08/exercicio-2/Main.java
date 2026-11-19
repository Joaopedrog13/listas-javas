import java.util.Scanner;

// Lista 08 - Exercício 2: testa a classe Calculadora com um menu de operações
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            opcao = (int) lerNumero(sc, "Escolha a operação: ");

            if (opcao >= 1 && opcao <= 4) {
                double a = lerNumero(sc, "Primeiro número: ");
                double b = lerNumero(sc, "Segundo número: ");
                switch (opcao) {
                    case 1 -> System.out.println("Resultado: " + a + " + " + b + " = " + calc.somar(a, b));
                    case 2 -> System.out.println("Resultado: " + a + " - " + b + " = " + calc.subtrair(a, b));
                    case 3 -> System.out.println("Resultado: " + a + " x " + b + " = " + calc.multiplicar(a, b));
                    case 4 -> {
                        try {
                            System.out.println("Resultado: " + a + " / " + b + " = " + calc.dividir(a, b));
                        } catch (ArithmeticException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    }
                }
            } else if (opcao == 5) {
                double base = lerNumero(sc, "Base: ");
                int expoente = (int) lerNumero(sc, "Expoente (inteiro): ");
                System.out.println("Resultado: " + base + " ^ " + expoente + " = " + calc.potencia(base, expoente));
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Escolha de 0 a 5.");
            }
        } while (opcao != 0);

        System.out.println("Calculadora encerrada.");
        sc.close();
    }

    static double lerNumero(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número.");
            }
        }
    }
}
