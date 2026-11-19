import java.util.Scanner;

import pessoa.Pessoa;
import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

// Lista 13 - Exercício 1: vetor de Pessoa com classes geradas pelo Lombok
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade = lerInt(sc, "Quantas pessoas deseja cadastrar? ");
        Pessoa[] pessoas = new Pessoa[quantidade];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\nPessoa " + (i + 1) + ":");
            int tipo = lerInt(sc, "  1 - Pessoa física | 2 - Pessoa jurídica: ");
            while (tipo != 1 && tipo != 2) {
                System.out.println("  Opção inválida!");
                tipo = lerInt(sc, "  1 - Pessoa física | 2 - Pessoa jurídica: ");
            }
            String nome = lerTexto(sc, "  Nome: ");
            String telefone = lerTexto(sc, "  Telefone: ");

            if (tipo == 1) {
                PessoaFisica pf = new PessoaFisica();      // construtor gerado por @NoArgsConstructor
                pf.setNome(nome);                          // setters gerados por @Setter
                pf.setTelefone(telefone);
                pf.setCpf(lerTexto(sc, "  CPF: "));
                pessoas[i] = pf;
            } else {
                PessoaJuridica pj = new PessoaJuridica();
                pj.setNome(nome);
                pj.setTelefone(telefone);
                pj.setCnpj(lerTexto(sc, "  CNPJ: "));
                pessoas[i] = pj;
            }
        }
        sc.close();

        System.out.println("\n=== Pessoas cadastradas ===");
        for (Pessoa p : pessoas) {
            System.out.println(p);                         // toString() gerado por @ToString
        }
    }

    static String lerTexto(Scanner sc, String msg) {
        System.out.print(msg);
        if (!sc.hasNextLine()) System.exit(0);
        return sc.nextLine().trim();
    }

    static int lerInt(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            if (!sc.hasNextLine()) System.exit(0);
            try {
                int v = Integer.parseInt(sc.nextLine().trim());
                if (v >= 0) return v;
            } catch (NumberFormatException e) { }
            System.out.println("Valor inválido! Digite um número inteiro maior ou igual a zero.");
        }
    }
}
