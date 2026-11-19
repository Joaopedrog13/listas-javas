import java.util.Scanner;

// Lista 04 - Exercício 1: ler e validar nota, salário, sexo e idade com do-while
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, salario;
        int idade;
        String sexo;
        boolean valido;

        // a) Nota: entre 0 e 100
        do {
            System.out.print("Informe a nota (0 a 100): ");
            nota = lerNumero(sc);
            valido = nota >= 0 && nota <= 100;
            if (!valido) System.out.println("Nota inválida! Digite um valor entre 0 e 100.");
        } while (!valido);
        System.out.println("Nota registrada com sucesso: " + nota);

        // b) Salário: maior que zero
        do {
            System.out.print("Informe o salário: ");
            salario = lerNumero(sc);
            valido = salario > 0;
            if (!valido) System.out.println("Salário inválido! Digite um valor maior que zero.");
        } while (!valido);
        System.out.printf("Salário registrado com sucesso: R$ %.2f%n", salario);

        // c) Sexo: m ou f
        do {
            System.out.print("Informe o sexo (m/f): ");
            sexo = sc.nextLine().trim().toLowerCase();
            valido = sexo.equals("m") || sexo.equals("f");
            if (!valido) System.out.println("Sexo inválido! Digite m ou f.");
        } while (!valido);
        System.out.println("Sexo registrado com sucesso: " + sexo);

        // d) Idade: entre 0 e 110
        do {
            System.out.print("Informe a idade (0 a 110): ");
            double valor = lerNumero(sc);
            idade = (int) valor;
            valido = valor == idade && idade >= 0 && idade <= 110;
            if (!valido) System.out.println("Idade inválida! Digite um número inteiro entre 0 e 110.");
        } while (!valido);
        System.out.println("Idade registrada com sucesso: " + idade);

        System.out.println("\nTodos os dados foram informados corretamente. Fim do programa.");
        sc.close();
    }

    // Lê um número aceitando vírgula ou ponto; se não for número, retorna -1 (valor inválido)
    static double lerNumero(Scanner sc) {
        String entrada = sc.nextLine().trim().replace(",", ".");
        try {
            return Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
