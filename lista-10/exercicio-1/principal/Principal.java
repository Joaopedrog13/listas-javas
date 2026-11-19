package principal;

import pessoa.*;

public class Principal {

  public static void main(String[] args) {
    Pessoa pessoa;

    pessoa = new PessoaFisica("Ana", "123.456.789-00");
    System.out.println(pessoa.getIdentificacao());

    pessoa = new PessoaJuridica("Escola", "03.278.251/0001-32");
    System.out.println(pessoa.getIdentificacao());

    // Nova classe: PessoaEstrangeira (atributo passaporte)
    pessoa = new PessoaEstrangeira("John Smith", "AB1234567");
    System.out.println(pessoa.getIdentificacao());

    // Polimorfismo: a mesma variável do tipo Pessoa, cada objeto responde do seu jeito
    System.out.println("\n--- Percorrendo um vetor de Pessoa ---");
    Pessoa[] pessoas = {
      new PessoaFisica("Carlos", "987.654.321-00"),
      new PessoaJuridica("EcoConecta", "12.345.678/0001-90"),
      new PessoaEstrangeira("Marie Dupont", "FR9876543")
    };
    for (Pessoa p : pessoas) {
      System.out.println(p.getIdentificacao());
    }

    // Sobrecarga: versão do método que recebe o telefone
    PessoaEstrangeira estrangeira = new PessoaEstrangeira("Hiro Tanaka", "JP5551234");
    System.out.println("\n" + estrangeira.getIdentificacao("(31) 99999-0000"));
  }
}
