import java.util.Scanner;

/**
 * Lista 09 - Exercício 1: testa a classe {@link ContaCorrente}.
 * Pede número e agência, faz um depósito e um saque, exibindo a conta após cada operação.
 */
public class Main {

    /**
     * Ponto de entrada do programa.
     *
     * @param args não utilizado
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = (int) lerNumero(sc, "Número da conta: ");
        int agencia = (int) lerNumero(sc, "Agência: ");
        ContaCorrente conta = new ContaCorrente(numero, agencia);

        conta.depositar(lerNumero(sc, "Valor para depósito: R$ "));
        System.out.println("\n" + conta.exibe() + "\n");

        conta.sacar(lerNumero(sc, "Valor para saque: R$ "));
        System.out.println("\n" + conta.exibe());
        sc.close();
    }

    /**
     * Lê um número do teclado, repetindo a pergunta até o valor ser válido.
     *
     * @param sc  scanner de entrada
     * @param msg mensagem exibida ao usuário
     * @return o número digitado
     */
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
