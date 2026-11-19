package pessoa;

public class PessoaEstrangeira extends Pessoa {
  private String passaporte;

  public PessoaEstrangeira(String nome, String passaporte) {
    super(nome);
    this.passaporte = passaporte;
  }

  public String getPassaporte() {
    return passaporte;
  }

  public void setPassaporte(String passaporte) {
    this.passaporte = passaporte;
  }

  @Override
  public String getIdentificacao() {
    return super.getIdentificacao() + " Passaporte: " + this.passaporte;
  }

  public String getIdentificacao(String telefone) {
    return super.getIdentificacao() + " Passaporte: " + this.passaporte + " Telefone: " + telefone;
  }
}
