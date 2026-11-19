// Lista 08 - Exercício 3: testa os métodos da classe Funcionario
public class Main {
    public static void main(String[] args) {
        Funcionario ana = new Funcionario("Ana Souza", "Analista Júnior", 3000);
        Funcionario bruno = new Funcionario("Bruno Lima", "Assistente", 2200);

        System.out.println("=== Dados iniciais ===");
        ana.exibirInformacoes();
        bruno.exibirInformacoes();

        System.out.println("\n=== Ana promovida a Analista Pleno com aumento de R$ 1.500 ===");
        ana.promover("Analista Pleno", 1500);
        ana.exibirInformacoes();

        System.out.println("\n=== Reajuste de 10% no salário do Bruno ===");
        bruno.reajustarSalario(10);
        bruno.exibirInformacoes();

        System.out.println("\n=== Bruno demitido ===");
        bruno.demitir();
        bruno.exibirInformacoes();
    }
}
