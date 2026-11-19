/** Funcionário com nome, cargo e salário. */
public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    /** Imprime os dados do funcionário. */
    public void exibirInformacoes() {
        System.out.printf("Nome: %s | Cargo: %s | Salário: R$ %.2f%n", nome, cargo, salario);
    }

    /** Altera o cargo e soma o aumento ao salário. */
    public void promover(String novoCargo, double aumento) {
        this.cargo = novoCargo;
        this.salario += aumento;
    }

    /** Aplica um reajuste percentual ao salário (ex.: 10 = 10%). */
    public void reajustarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

    /** Zera o salário e muda o cargo para "Desligado". */
    public void demitir() {
        this.salario = 0;
        this.cargo = "Desligado";
    }
}
