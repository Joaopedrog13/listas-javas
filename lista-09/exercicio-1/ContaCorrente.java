import java.util.Locale;

/**
 * Representa uma conta corrente bancária, com número, agência e saldo.
 * Permite depósitos e saques, sem deixar o saldo ficar negativo.
 *
 * @author Equipe EcoConecta - PUC Minas
 */
public class ContaCorrente {
    private int numero, agencia;
    private double saldo;

    /**
     * Construtor: cria a conta com saldo zero.
     * (Substitui o antigo método iniciarContaCorrente.)
     *
     * @param numero  número da conta
     * @param agencia número da agência
     */
    public ContaCorrente(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
    }

    /**
     * Saca um valor da conta. O saque só é feito se o valor for
     * positivo e não for maior que o saldo; caso contrário, exibe um erro.
     *
     * @param valor valor a ser sacado
     * @return true se o saque foi feito; false se foi recusado
     */
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do saque deve ser maior que zero.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente. Saque de R$ "
                    + formatar(valor) + " recusado.");
            return false;
        }
        saldo = saldo - valor;
        return true;
    }

    /**
     * Deposita um valor na conta.
     *
     * @param valor valor a ser depositado (deve ser positivo)
     */
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do depósito deve ser maior que zero.");
            return;
        }
        saldo = saldo + valor;
    }

    /**
     * Consulta o saldo atual.
     *
     * @return o saldo da conta
     */
    public double consultarSaldo() {
        return saldo;
    }

    /**
     * Retorna os dados da conta: agência, número e saldo.
     *
     * @return texto com os dados da conta
     */
    public String exibe() {
        return "Agência: " + agencia + "\nConta: " + numero + "\nSaldo: R$ " + formatar(saldo) + ".";
    }

    /** Formata um valor com duas casas decimais e vírgula (ex.: 3257,48). */
    private static String formatar(double valor) {
        return String.format(Locale.forLanguageTag("pt-BR"), "%.2f", valor);
    }
}
